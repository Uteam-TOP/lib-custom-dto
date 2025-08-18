package ru.fvds.cdss13.lib.client;

import jakarta.annotation.PreDestroy;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.Headers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import ru.fvds.cdss13.lib.exception.BusinessException;

import java.util.Properties;
import java.util.UUID;

@Service
public class KafkaProducerService<Dto> {

    private static final Logger logger = LoggerFactory.getLogger(KafkaProducerService.class);

    private final KafkaProducer<String, Dto> producer;
    private final KafkaConsumerService<Dto> kafkaConsumerService;

    public KafkaProducerService(Environment env, KafkaConsumerService<Dto> kafkaConsumerService) {
        this.kafkaConsumerService = kafkaConsumerService;
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, env.getProperty("spring.kafka.bootstrap-servers"));
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, env.getProperty("spring.kafka.producer.key-serializer"));
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, env.getProperty("spring.kafka.producer.value-serializer"));
        this.producer = new KafkaProducer<>(props);
    }

    /**
     * метод используется когда серверу надо отправить сообщение и получить ответ
     * @param dto
     * @param topic
     * @return
     */
    public ConsumerRecord<String, Dto> sendToResponse(Dto dto, String topic, String receivedTopic, Headers headers) {
        String uuid = UUID.randomUUID().toString();
        ProducerRecord<String, Dto> producerRecord = new ProducerRecord<>(
                topic,
                null,
                uuid,
                dto,
                headers
        );
        producer.send(producerRecord);
        ConsumerRecord<String, Dto> result = kafkaConsumerService.pollMessages(producerRecord, receivedTopic);
        logger.info("sendToResponse topic {}", topic);
        if (result == null){
            throw new BusinessException("403", "Not found");
        }
        return result;
    }


    /**
     * отправка на получение
     * @param uuid
     * @param topic
     * @param dto
     * @param headers
     */
    public void sendGetResponse(String uuid, String topic, Dto dto, Headers headers) {
        ProducerRecord<String, Dto> producerRecord = new ProducerRecord<>(
                topic,
                null,
                null,
                uuid,
                dto,
                headers
        );
        producer.send(producerRecord);
    }


    @PreDestroy
    public void closeAll(){
        producer.close();
    }


}

package ru.fvds.cdss13.lib.client;


import jakarta.annotation.PreDestroy;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import ru.fvds.cdss13.lib.dto.TopicsApp;
import ru.fvds.cdss13.lib.exception.BusinessException;

import java.time.Duration;
import java.util.Properties;

@Service
public class KafkaConsumerService<Dto>{

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);

    private final KafkaConsumer<String, Dto> consumer;

    public KafkaConsumerService(Environment env, TopicsApp topics) {

        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, env.getProperty("spring.kafka.bootstrap-servers"));
        props.put(ConsumerConfig.GROUP_ID_CONFIG, env.getProperty("spring.kafka.consumer.group-id"));
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, env.getProperty("spring.kafka.consumer.key-deserializer"));
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, env.getProperty("spring.kafka.consumer.value-deserializer"));
        props.put(JsonDeserializer.TRUSTED_PACKAGES, "*");
        this.consumer = new KafkaConsumer<>(props);
        this.consumer.subscribe(topics.getConsumers());
    }

    /**
     * Polls messages from Kafka topic indefinitely.
     */
    @Nullable
    public ConsumerRecord<String, Dto> pollMessages(ProducerRecord<String,Dto> producerRecord) {
        boolean isProcess = true;
        ConsumerRecord<String, Dto> consumerRecord = null;
        try {
            while (isProcess) {
                Iterable<ConsumerRecord<String, Dto>> records = consumer.poll(Duration.ofMillis(100))
                        .records(producerRecord.topic());
                for (ConsumerRecord<String, Dto> result : records) {
                    if (result.key().equals(producerRecord.key())) {
                        consumerRecord = result;
                        isProcess = false;
                        break;
                    }
                }
            }
            logger.info("send kafka topic {}", producerRecord.topic());
        } catch (Exception e){
            throw new BusinessException("500", "ERROR kafka");
        }

        return consumerRecord;
    }



    /**
     * Closes the Kafka consumer.
     */
    @PreDestroy
    public void close() {
        consumer.close();
    }
}

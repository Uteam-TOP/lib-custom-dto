package ru.fvds.cdss13.lib.util;

import jakarta.annotation.Nullable;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.header.internals.RecordHeaders;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.util.StringUtils;
import ru.fvds.cdss13.lib.dto.Operation;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;


public class KafkaUtil<Dto> {

    private static final String KEY_HEADER_OPERATION = "operation";
    private static final String KEY_HEADER_RECEIVED_TOPIC = KafkaHeaders.RECEIVED_TOPIC;

    private String prefix;
    private String key;
    private Dto dto;
    private String topic;
    private String receivedTopic;
    private Operation operation;
    private Headers headers;

    private KafkaUtil(ConsumerRecord<String, Dto> consumerRecord) {
        this.key = consumerRecord.key();
        this.dto = consumerRecord.value();
        this.topic = consumerRecord.topic();
        this.headers = consumerRecord.headers();
        this.receivedTopic = lastHeader(consumerRecord.headers(), KEY_HEADER_RECEIVED_TOPIC);
        this.operation = lastHeaderForOperation(consumerRecord.headers(), KEY_HEADER_OPERATION);
    }

    private KafkaUtil(ProducerRecord<String, Dto> producerRecord) {
        this.key = producerRecord.key();
        this.topic = producerRecord.topic();
        this.dto = producerRecord.value();
        this.headers = producerRecord.headers();
        this.receivedTopic = lastHeader(producerRecord.headers(), KEY_HEADER_RECEIVED_TOPIC);
        this.operation = lastHeaderForOperation(producerRecord.headers(), KEY_HEADER_OPERATION);
    }


    private static Operation lastHeaderForOperation(Headers headers, String key){
        return Operation.valueOf(new String(headers.lastHeader(KEY_HEADER_RECEIVED_TOPIC).value()).intern());
    }

    private static String lastHeader(Headers headers, String key){
        return new String(headers.lastHeader(KEY_HEADER_RECEIVED_TOPIC).value()).intern();
    }

    public static Headers createHeaders(Map<String,String> props){
        Headers headers = new RecordHeaders();
        props.forEach((key,value) -> headers.add(key, value.getBytes(StandardCharsets.UTF_8)));
        return headers;
    }

}

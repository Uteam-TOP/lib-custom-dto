package ru.fvds.cdss13.lib.util;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.header.internals.RecordHeaders;
import org.springframework.kafka.support.KafkaHeaders;
import ru.fvds.cdss13.lib.dto.Operation;

import java.nio.charset.StandardCharsets;
import java.util.Map;


public class KafkaUtil<Dto> {

    public static final String KEY_HEADER_OPERATION = "operation";
    private static final String KEY_HEADER_RECEIVED_TOPIC = KafkaHeaders.RECEIVED_TOPIC;

    private String prefix;
    private String key;
    private Dto dto;
    private String topic;
    private String receivedTopic;
    private Operation operation;
    private Headers headers;

    public KafkaUtil(ConsumerRecord<String, Dto> consumerRecord) {
        this.key = consumerRecord.key();
        this.dto = consumerRecord.value();
        this.topic = consumerRecord.topic();
        this.headers = consumerRecord.headers();
        this.receivedTopic = lastHeader(consumerRecord.headers(), KEY_HEADER_RECEIVED_TOPIC);
        this.operation = lastHeaderForOperation(consumerRecord.headers(), KEY_HEADER_OPERATION);
    }

    public KafkaUtil(ProducerRecord<String, Dto> producerRecord) {
        this.key = producerRecord.key();
        this.topic = producerRecord.topic();
        this.dto = producerRecord.value();
        this.headers = producerRecord.headers();
        this.receivedTopic = lastHeader(producerRecord.headers(), KEY_HEADER_RECEIVED_TOPIC);
        this.operation = lastHeaderForOperation(producerRecord.headers(), KEY_HEADER_OPERATION);
    }


    private static Operation lastHeaderForOperation(Headers headers, String key){
        return Operation.valueOf(new String(headers.lastHeader(key).value()).intern());
    }

    private static String lastHeader(Headers headers, String key){
        return new String(headers.lastHeader(key).value()).intern();
    }

    public static Headers createHeaders(Map<String,String> props){
        Headers headers = new RecordHeaders();
        props.forEach((key,value) -> headers.add(key, value.getBytes(StandardCharsets.UTF_8)));
        return headers;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Dto getDto() {
        return dto;
    }

    public void setDto(Dto dto) {
        this.dto = dto;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getReceivedTopic() {
        return receivedTopic;
    }

    public void setReceivedTopic(String receivedTopic) {
        this.receivedTopic = receivedTopic;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Headers getHeaders() {
        return headers;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KafkaUtil<?> kafkaUtil = (KafkaUtil<?>) o;

        if (!prefix.equals(kafkaUtil.prefix)) return false;
        if (!key.equals(kafkaUtil.key)) return false;
        if (!dto.equals(kafkaUtil.dto)) return false;
        if (!topic.equals(kafkaUtil.topic)) return false;
        if (!receivedTopic.equals(kafkaUtil.receivedTopic)) return false;
        if (operation != kafkaUtil.operation) return false;
        return headers.equals(kafkaUtil.headers);
    }

    @Override
    public int hashCode() {
        int result = prefix.hashCode();
        result = 31 * result + key.hashCode();
        result = 31 * result + dto.hashCode();
        result = 31 * result + topic.hashCode();
        result = 31 * result + receivedTopic.hashCode();
        result = 31 * result + operation.hashCode();
        result = 31 * result + headers.hashCode();
        return result;
    }


}

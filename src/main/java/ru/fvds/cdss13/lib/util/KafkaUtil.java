package ru.fvds.cdss13.lib.util;

public class KafkaUtil {

    private Object dto;
    private String prefix;
    private String topic;

    private KafkaUtil(Object dto, String prefix) {
        this.dto = dto;
        this.prefix = prefix;
        this.topic = prefix.formatted(dto.getClass().getCanonicalName());
    }

    public static KafkaUtil createTopic(Object dto, String prefix){
        return new KafkaUtil(dto, prefix);
    }

    public Object getDto() {
        return dto;
    }

    public void setDto(Object dto) {
        this.dto = dto;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}

package ru.fvds.cdss13.lib.util;

public class KafkaUtil {

    private Class<?> dtoClass;
    private String prefix;
    private String topic;

    private KafkaUtil(Class<?> dtoClass, String prefix) {
        this.dtoClass = dtoClass;
        this.prefix = prefix;
        this.topic = prefix.formatted(dtoClass.getCanonicalName());
    }

    public static KafkaUtil createTopic(Class<?> dtoClass, String prefix){
        return new KafkaUtil(dtoClass, prefix);
    }

    public Class<?> getDto() {
        return dtoClass;
    }

    public void setDto(Class<?> dto) {
        this.dtoClass = dto;
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

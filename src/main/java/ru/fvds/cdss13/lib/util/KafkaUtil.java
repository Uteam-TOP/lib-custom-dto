package ru.fvds.cdss13.lib.util;

public class KafkaUtil<Dto> {

    private Dto dto;
    private String prefix;
    private String topic;

    private KafkaUtil(Dto dto, String prefix) {
        this.dto = dto;
        this.prefix = prefix;
        this.topic = prefix.formatted(dto.getClass().getCanonicalName());
    }

    public KafkaUtil<Dto> createTopic(Dto dto, String prefix){
        return new KafkaUtil<Dto>(dto, prefix);
    }

    public Dto getDto() {
        return dto;
    }

    public void setDto(Dto dto) {
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

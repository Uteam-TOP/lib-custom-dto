package ru.fvds.cdss13.lib.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "spring.kafka")
public class TopicsApp {
    private List<String> topics;

    // Геттеры и сеттеры обязательны!
    public List<String> getConsumers() {
        return topics;
    }

    public void setConsumers(List<String> consumers) {
        this.topics = consumers;
    }

}

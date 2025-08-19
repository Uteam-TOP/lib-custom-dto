package ru.fvds.cdss13.lib.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static ru.fvds.cdss13.lib.dto.EventPrefix._RESPONSE;

@Component
@ConfigurationProperties(prefix = "spring.kafka")
public class TopicsApp {
    private List<String> topics;

    // Геттеры и сеттеры обязательны!
    public List<String> getConsumers() {
        return topics;
    }

    public void setConsumers(List<String> consumers) {
        List<String> suffixResponse = new ArrayList<>(consumers.stream().map(s -> s + _RESPONSE.name()).toList());
        if (suffixResponse.addAll(new ArrayList<>(consumers))){
            this.topics = suffixResponse;
        } else {
            throw new RuntimeException("Не создались списки топиков");
        }

    }

}

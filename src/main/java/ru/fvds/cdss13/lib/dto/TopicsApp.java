package ru.fvds.cdss13.lib.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import ru.fvds.cdss13.lib.exception.BusinessException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        if (suffixResponse.addAll(consumers)){
            this.topics = suffixResponse;
        }
        throw new RuntimeException("Не создались списки топиков");

    }

}

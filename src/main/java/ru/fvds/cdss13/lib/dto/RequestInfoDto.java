package ru.fvds.cdss13.lib.dto;

import lombok.*;

import java.time.Instant;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RequestInfoDto {
    private String method;
    private String details;
    private String userId;
    private Map<String, String[]> params;
    private Map<String, String[]> headers;
    private String body;
    //TODO заполнить потом
    private Instant timestamp;
}

package ru.fvds.cdss13.lib.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

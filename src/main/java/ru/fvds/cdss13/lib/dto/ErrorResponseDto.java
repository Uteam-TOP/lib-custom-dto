package ru.fvds.cdss13.lib.dto;

import lombok.*;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ErrorResponseDto {

    private int httpStatus;


    private String userMessage;


    private String details;

    private String exception;

    private Instant timestamp;

    private String stackTrace;


    private RequestInfoDto requestInfo;

    public ErrorResponseDto(int httpStatus, String userMessage, String details, String exception) {
        this.httpStatus = httpStatus;
        this.userMessage = userMessage;
        this.details = details;
        this.exception = exception;
        this.timestamp = Instant.now();
    }


}
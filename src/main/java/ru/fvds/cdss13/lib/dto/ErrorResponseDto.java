package ru.fvds.cdss13.lib.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
package ru.fvds.cdss13.lib.dto;



import java.time.Instant;


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

    public ErrorResponseDto() {
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public RequestInfoDto getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(RequestInfoDto requestInfo) {
        this.requestInfo = requestInfo;
    }
}
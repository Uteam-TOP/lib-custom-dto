package ru.fvds.cdss13.lib.exception;

import org.springframework.http.HttpStatus;

public class BusinessException extends AbstractOpenApiException {

    public BusinessException(HttpStatus httpStatus, String message) {
        super(String.valueOf(httpStatus.value()), message);
    }

    public BusinessException(HttpStatus httpStatus, String message, Throwable cause) {
        super(String.valueOf(httpStatus.value()), message, cause);
    }

    public BusinessException(HttpStatus httpStatus, String message, String userMessage) {
        super(String.valueOf(httpStatus.value()), message, userMessage);
    }

    public BusinessException(HttpStatus httpStatus, String message, String userMessage, Throwable cause) {
        super(String.valueOf(httpStatus.value()), message, userMessage, cause);
    }
}

package ru.fvds.cdss13.lib.exception;



public class BusinessException extends AbstractOpenApiException {


    protected BusinessException(String httpStatus, String message) {
        super(httpStatus, message);
    }

    protected BusinessException(String httpStatus, String message, String userMessage) {
        super(httpStatus, message, userMessage);
    }

    protected BusinessException(String httpStatus, String message, Throwable cause) {
        super(httpStatus, message, cause);
    }

    protected BusinessException(String httpStatus, String message, String userMessage, Throwable cause) {
        super(httpStatus, message, userMessage, cause);
    }
}

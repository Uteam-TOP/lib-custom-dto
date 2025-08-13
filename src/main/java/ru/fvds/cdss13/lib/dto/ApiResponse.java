package ru.fvds.cdss13.lib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse<Dto> {

    private boolean success;
    private String code;
    private String message;
    private Dto data;  // Обобщенный тип для полезной нагрузки

    // Геттеры и сеттеры (обязательны для десериализации JSON)
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Dto getData() {
        return data;
    }

    public void setData(Dto data) {
        this.data = data;
    }

    public ApiResponse() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

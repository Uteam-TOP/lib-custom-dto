package ru.fvds.cdss13.lib.dto.email;


import java.util.List;

public class HTTPValidationError {

    List<ValidationError> detail;

    public HTTPValidationError() {
    }

    public List<ValidationError> getDetail() {
        return detail;
    }

    public void setDetail(List<ValidationError> detail) {
        this.detail = detail;
    }
}

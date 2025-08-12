package ru.fvds.cdss13.lib.dto.email;



import java.io.Serializable;


public class EmailGetResponse implements Serializable {
    private String status;

    public EmailGetResponse(String status) {
        this.status = status;
    }

    public EmailGetResponse() {

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

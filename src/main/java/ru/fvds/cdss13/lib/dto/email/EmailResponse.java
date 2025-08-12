package ru.fvds.cdss13.lib.dto.email;




public class EmailResponse {
    private StatusSendEmail statusSendEmail;
    private String message;

    public EmailResponse() {
    }

    public StatusSendEmail getStatusSendEmail() {
        return statusSendEmail;
    }

    public void setStatusSendEmail(StatusSendEmail statusSendEmail) {
        this.statusSendEmail = statusSendEmail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

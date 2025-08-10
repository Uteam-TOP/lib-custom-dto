package ru.fvds.cdss13.lib.dto.email;


import java.io.Serializable;

/**
 * Запрос на сервер почты
 */

public class TextMessageRequest implements Serializable {
    /**
     * email пользователя
     */
    private String email;
    /**
     * ссылку для подтверждения
     */
    private String subject;
    private String message;

    public TextMessageRequest(String email, String subject, String message) {
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

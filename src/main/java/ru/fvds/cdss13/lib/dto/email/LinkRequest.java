package ru.fvds.cdss13.lib.dto.email;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * Запрос на сервер почты  /email/send-registration-confirmation
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
public class LinkRequest implements Serializable {
    /**
     * email пользователя
     */
    String email;
    /**
     * ссылку для подтверждения
     */
    String link;

    public LinkRequest(String email, String link) {
        this.email = email;
        this.link = link;
    }
}

package ru.fvds.cdss13.lib.dto.email;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmailGetResponse implements Serializable {
    String status;

    public EmailGetResponse(String status) {
        this.status = status;
    }
}

package ru.fvds.cdss13.lib.dto.email;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmailResponse {
    StatusSendEmail statusSendEmail;
    String message;
}

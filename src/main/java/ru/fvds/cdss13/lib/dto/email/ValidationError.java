package ru.fvds.cdss13.lib.dto.email;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
public class ValidationError {
    List<?> loc;
    String msg;
    String type;
}

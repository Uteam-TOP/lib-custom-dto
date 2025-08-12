package ru.fvds.cdss13.lib.dto.email;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;


public class ValidationError {
    List<?> loc;
    String msg;
    String type;
}

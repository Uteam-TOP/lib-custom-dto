package ru.fvds.cdss13.lib.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус регистрации
 */

public enum RegistrationStatus {
  
  OPEN("OPEN"),
  
  PENDING("PENDING"),
  
  CLOSED("CLOSED");

  private String value;

  RegistrationStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RegistrationStatus fromValue(String value) {
    for (RegistrationStatus b : RegistrationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


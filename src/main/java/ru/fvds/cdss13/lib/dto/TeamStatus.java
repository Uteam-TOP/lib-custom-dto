package ru.fvds.cdss13.lib.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус заявки команды
 */

public enum TeamStatus {
  
  PENDING("PENDING"),
  
  APPROVED("APPROVED"),
  
  REJECTED("REJECTED");

  private String value;

  TeamStatus(String value) {
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
  public static TeamStatus fromValue(String value) {
    for (TeamStatus b : TeamStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


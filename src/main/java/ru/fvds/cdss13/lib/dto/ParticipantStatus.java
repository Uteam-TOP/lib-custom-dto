package ru.fvds.cdss13.lib.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус заявки участника
 */

public enum ParticipantStatus {
  
  PENDING("PENDING"),
  
  APPROVED("APPROVED"),
  
  REJECTED("REJECTED");

  private String value;

  ParticipantStatus(String value) {
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
  public static ParticipantStatus fromValue(String value) {
    for (ParticipantStatus b : ParticipantStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


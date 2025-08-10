package ru.fvds.cdss13.lib.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Формат проведения хакатона
 */

public enum HackathonFormat {
  
  ONLINE("ONLINE"),
  
  OFFLINE("OFFLINE"),
  
  HYBRID("HYBRID");

  private String value;

  HackathonFormat(String value) {
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
  public static HackathonFormat fromValue(String value) {
    for (HackathonFormat b : HackathonFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


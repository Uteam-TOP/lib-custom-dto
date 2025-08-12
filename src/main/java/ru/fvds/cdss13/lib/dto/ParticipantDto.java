package ru.fvds.cdss13.lib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ParticipantDto
 */

public class ParticipantDto {

  private @Nullable Long id;

  private @Nullable String profession;

  private UserDto user;

  private ParticipantStatus status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  /**
   * Constructor with only required parameters
   */
  public ParticipantDto(UserDto user, ParticipantStatus status) {
    this.user = user;
    this.status = status;
  }

  public ParticipantDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентификатор участника
   * @return id
   */
  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ParticipantDto profession(String profession) {
    this.profession = profession;
    return this;
  }

  /**
   * Get profession
   * @return profession
   */
  @Size(min = 0, max = 200) 
  @JsonProperty("profession")
  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  public ParticipantDto user(UserDto user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @NotNull @Valid 
  @JsonProperty("user")
  public UserDto getUser() {
    return user;
  }

  public void setUser(UserDto user) {
    this.user = user;
  }

  public ParticipantDto status(ParticipantStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @JsonProperty("status")
  public ParticipantStatus getStatus() {
    return status;
  }

  public void setStatus(ParticipantStatus status) {
    this.status = status;
  }

  public ParticipantDto createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата подачи заявки участника
   * @return createdAt
   */
  @Valid 
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantDto participantDto = (ParticipantDto) o;
    return Objects.equals(this.id, participantDto.id) &&
        Objects.equals(this.profession, participantDto.profession) &&
        Objects.equals(this.user, participantDto.user) &&
        Objects.equals(this.status, participantDto.status) &&
        Objects.equals(this.createdAt, participantDto.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, profession, user, status, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    profession: ").append(toIndentedString(profession)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


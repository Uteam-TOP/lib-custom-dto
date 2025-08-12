package ru.fvds.cdss13.lib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import javax.xml.validation.Schema;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * TeamDto
 */

public class TeamDto {

  private @Nullable Long id;

  private @Nullable String nickname;

  private Integer participantCount;

  private @Nullable String avatarLink;

  private TeamStatus status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  /**
   * Constructor with only required parameters
   */
  public TeamDto(Integer participantCount, TeamStatus status) {
    this.participantCount = participantCount;
    this.status = status;
  }

  public TeamDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентификатор команды
   * @return id
   */
  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TeamDto nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Название проекта
   * @return nickname
   */
  @Size(min = 1, max = 100) 
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public TeamDto participantCount(Integer participantCount) {
    this.participantCount = participantCount;
    return this;
  }

  /**
   * Количество участников в команде
   * minimum: 1
   * @return participantCount
   */
  @NotNull @Min(1) 
  @JsonProperty("participantCount")
  public Integer getParticipantCount() {
    return participantCount;
  }

  public void setParticipantCount(Integer participantCount) {
    this.participantCount = participantCount;
  }

  public TeamDto avatarLink(String avatarLink) {
    this.avatarLink = avatarLink;
    return this;
  }

  /**
   * Ссылка на аватар команды
   * @return avatarLink
   */
  @Size(max = 200) 
  @JsonProperty("avatarLink")
  public String getAvatarLink() {
    return avatarLink;
  }

  public void setAvatarLink(String avatarLink) {
    this.avatarLink = avatarLink;
  }

  public TeamDto status(TeamStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @JsonProperty("status")
  public TeamStatus getStatus() {
    return status;
  }

  public void setStatus(TeamStatus status) {
    this.status = status;
  }

  public TeamDto createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата создания команды
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
    TeamDto teamDto = (TeamDto) o;
    return Objects.equals(this.id, teamDto.id) &&
        Objects.equals(this.nickname, teamDto.nickname) &&
        Objects.equals(this.participantCount, teamDto.participantCount) &&
        Objects.equals(this.avatarLink, teamDto.avatarLink) &&
        Objects.equals(this.status, teamDto.status) &&
        Objects.equals(this.createdAt, teamDto.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nickname, participantCount, avatarLink, status, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    participantCount: ").append(toIndentedString(participantCount)).append("\n");
    sb.append("    avatarLink: ").append(toIndentedString(avatarLink)).append("\n");
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


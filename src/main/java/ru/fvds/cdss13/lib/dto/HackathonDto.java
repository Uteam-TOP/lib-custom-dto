package ru.fvds.cdss13.lib.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * HackathonDto
 */

public class HackathonDto {

  private @Nullable Long id;

  private String title;

  private @Nullable String nickname;

  private @Nullable String imageLink;

  private @Nullable String shortDescription;

  private HackathonFormat format;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime registrationStartDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime registrationDeadline;

  private @Nullable Boolean registrationSuspended;

  private String organizer;

  private String focus;

  private String targetAudience;

  private @Nullable String participationConditions;

  private @Nullable String prizePool;

  private @Nullable String location;

  private @Nullable String hackathonLink;

  private @Nullable String customLink;

  private @Nullable String telegram;

  private RegistrationStatus registrationStatus;

  @Valid
  private List<@Valid TeamDto> teams = new ArrayList<>();

  @Valid
  private List<@Valid ParticipantDto> participants = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  private @Nullable
  UserDto creator;

  private @Nullable Boolean hasApplied;

  /**
   * Constructor with only required parameters
   */
  public HackathonDto(String title, HackathonFormat format, OffsetDateTime startDate, OffsetDateTime endDate, OffsetDateTime registrationDeadline, String organizer, String focus, String targetAudience, RegistrationStatus registrationStatus) {
    this.title = title;
    this.format = format;
    this.startDate = startDate;
    this.endDate = endDate;
    this.registrationDeadline = registrationDeadline;
    this.organizer = organizer;
    this.focus = focus;
    this.targetAudience = targetAudience;
    this.registrationStatus = registrationStatus;
  }

  public HackathonDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентификатор хакатона
   * @return id
   */
  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public HackathonDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Название хакатона
   * @return title
   */
  @NotNull @Size(min = 1, max = 200) 
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public HackathonDto nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Уникальный никнейм хакатона
   * @return nickname
   */
  @Size(min = 1, max = 50) 
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public HackathonDto imageLink(String imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  /**
   * Ссылка на изображение хакатона
   * @return imageLink
   */
  @Size(max = 200) 
  @JsonProperty("imageLink")
  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  public HackathonDto shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Краткое описание хакатона
   * @return shortDescription
   */
  @Size(max = 300) 
  @JsonProperty("shortDescription")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public HackathonDto format(HackathonFormat format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  @NotNull @Valid 
  @JsonProperty("format")
  public HackathonFormat getFormat() {
    return format;
  }

  public void setFormat(HackathonFormat format) {
    this.format = format;
  }

  public HackathonDto startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Дата и время начала хакатона
   * @return startDate
   */
  @NotNull @Valid 
  @JsonProperty("startDate")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public HackathonDto endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Дата и время окончания хакатона
   * @return endDate
   */
  @NotNull @Valid 
  @JsonProperty("endDate")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public HackathonDto registrationStartDate(OffsetDateTime registrationStartDate) {
    this.registrationStartDate = registrationStartDate;
    return this;
  }

  /**
   * Дата и время начала регистрации
   * @return registrationStartDate
   */
  @Valid 
  @JsonProperty("registrationStartDate")
  public OffsetDateTime getRegistrationStartDate() {
    return registrationStartDate;
  }

  public void setRegistrationStartDate(OffsetDateTime registrationStartDate) {
    this.registrationStartDate = registrationStartDate;
  }

  public HackathonDto registrationDeadline(OffsetDateTime registrationDeadline) {
    this.registrationDeadline = registrationDeadline;
    return this;
  }

  /**
   * Крайний срок регистрации
   * @return registrationDeadline
   */
  @NotNull @Valid 
  @JsonProperty("registrationDeadline")
  public OffsetDateTime getRegistrationDeadline() {
    return registrationDeadline;
  }

  public void setRegistrationDeadline(OffsetDateTime registrationDeadline) {
    this.registrationDeadline = registrationDeadline;
  }

  public HackathonDto registrationSuspended(Boolean registrationSuspended) {
    this.registrationSuspended = registrationSuspended;
    return this;
  }

  /**
   * Если true, то подать заявку нельзя
   * @return registrationSuspended
   */
  
  @JsonProperty("registrationSuspended")
  public Boolean getRegistrationSuspended() {
    return registrationSuspended;
  }

  public void setRegistrationSuspended(Boolean registrationSuspended) {
    this.registrationSuspended = registrationSuspended;
  }

  public HackathonDto organizer(String organizer) {
    this.organizer = organizer;
    return this;
  }

  /**
   * Организатор хакатона
   * @return organizer
   */
  @NotNull @Size(max = 100) 
  @JsonProperty("organizer")
  public String getOrganizer() {
    return organizer;
  }

  public void setOrganizer(String organizer) {
    this.organizer = organizer;
  }

  public HackathonDto focus(String focus) {
    this.focus = focus;
    return this;
  }

  /**
   * Основная тематика хакатона
   * @return focus
   */
  @NotNull @Size(max = 200) 
  @JsonProperty("focus")
  public String getFocus() {
    return focus;
  }

  public void setFocus(String focus) {
    this.focus = focus;
  }

  public HackathonDto targetAudience(String targetAudience) {
    this.targetAudience = targetAudience;
    return this;
  }

  /**
   * Целевая аудитория хакатона
   * @return targetAudience
   */
  @NotNull @Size(max = 200) 
  @JsonProperty("targetAudience")
  public String getTargetAudience() {
    return targetAudience;
  }

  public void setTargetAudience(String targetAudience) {
    this.targetAudience = targetAudience;
  }

  public HackathonDto participationConditions(String participationConditions) {
    this.participationConditions = participationConditions;
    return this;
  }

  /**
   * Условия участия
   * @return participationConditions
   */
  @Size(max = 1500) 
  @JsonProperty("participationConditions")
  public String getParticipationConditions() {
    return participationConditions;
  }

  public void setParticipationConditions(String participationConditions) {
    this.participationConditions = participationConditions;
  }

  public HackathonDto prizePool(String prizePool) {
    this.prizePool = prizePool;
    return this;
  }

  /**
   * Призовой фонд
   * @return prizePool
   */
  @Size(max = 200) 
  @JsonProperty("prizePool")
  public String getPrizePool() {
    return prizePool;
  }

  public void setPrizePool(String prizePool) {
    this.prizePool = prizePool;
  }

  public HackathonDto location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Место проведения (физическое или виртуальное)
   * @return location
   */
  @Size(max = 200) 
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public HackathonDto hackathonLink(String hackathonLink) {
    this.hackathonLink = hackathonLink;
    return this;
  }

  /**
   * Ссылка на страницу хакатона
   * @return hackathonLink
   */
  @Size(max = 200) 
  @JsonProperty("hackathonLink")
  public String getHackathonLink() {
    return hackathonLink;
  }

  public void setHackathonLink(String hackathonLink) {
    this.hackathonLink = hackathonLink;
  }

  public HackathonDto customLink(String customLink) {
    this.customLink = customLink;
    return this;
  }

  /**
   * Собственная ссылка организатора
   * @return customLink
   */
  @Size(max = 200) 
  @JsonProperty("customLink")
  public String getCustomLink() {
    return customLink;
  }

  public void setCustomLink(String customLink) {
    this.customLink = customLink;
  }

  public HackathonDto telegram(String telegram) {
    this.telegram = telegram;
    return this;
  }

  /**
   * Telegram контакт для связи
   * @return telegram
   */
  @Size(max = 32) 
  @JsonProperty("telegram")
  public String getTelegram() {
    return telegram;
  }

  public void setTelegram(String telegram) {
    this.telegram = telegram;
  }

  public HackathonDto registrationStatus(RegistrationStatus registrationStatus) {
    this.registrationStatus = registrationStatus;
    return this;
  }

  /**
   * Get registrationStatus
   * @return registrationStatus
   */
  @NotNull @Valid 
  @JsonProperty("registrationStatus")
  public RegistrationStatus getRegistrationStatus() {
    return registrationStatus;
  }

  public void setRegistrationStatus(RegistrationStatus registrationStatus) {
    this.registrationStatus = registrationStatus;
  }

  public HackathonDto teams(List<@Valid TeamDto> teams) {
    this.teams = teams;
    return this;
  }

  public HackathonDto addTeamsItem(TeamDto teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Список участвующих команд
   * @return teams
   */
  @Valid 
  @JsonProperty("teams")
  public List<@Valid TeamDto> getTeams() {
    return teams;
  }

  public void setTeams(List<@Valid TeamDto> teams) {
    this.teams = teams;
  }

  public HackathonDto participants(List<@Valid ParticipantDto> participants) {
    this.participants = participants;
    return this;
  }

  public HackathonDto addParticipantsItem(ParticipantDto participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<>();
    }
    this.participants.add(participantsItem);
    return this;
  }

  /**
   * Список индивидуальных участников
   * @return participants
   */
  @Valid 
  @JsonProperty("participants")
  public List<@Valid ParticipantDto> getParticipants() {
    return participants;
  }

  public void setParticipants(List<@Valid ParticipantDto> participants) {
    this.participants = participants;
  }

  public HackathonDto createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата создания хакатона
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

  public HackathonDto creator(UserDto creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
   */
  @Valid 
  @JsonProperty("creator")
  public UserDto getCreator() {
    return creator;
  }

  public void setCreator(UserDto creator) {
    this.creator = creator;
  }

  public HackathonDto hasApplied(Boolean hasApplied) {
    this.hasApplied = hasApplied;
    return this;
  }

  /**
   * Подал ли пользователь заявку на участие в хакатоне
   * @return hasApplied
   */
  
  @JsonProperty("hasApplied")
  public Boolean getHasApplied() {
    return hasApplied;
  }

  public void setHasApplied(Boolean hasApplied) {
    this.hasApplied = hasApplied;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HackathonDto hackathonDto = (HackathonDto) o;
    return Objects.equals(this.id, hackathonDto.id) &&
        Objects.equals(this.title, hackathonDto.title) &&
        Objects.equals(this.nickname, hackathonDto.nickname) &&
        Objects.equals(this.imageLink, hackathonDto.imageLink) &&
        Objects.equals(this.shortDescription, hackathonDto.shortDescription) &&
        Objects.equals(this.format, hackathonDto.format) &&
        Objects.equals(this.startDate, hackathonDto.startDate) &&
        Objects.equals(this.endDate, hackathonDto.endDate) &&
        Objects.equals(this.registrationStartDate, hackathonDto.registrationStartDate) &&
        Objects.equals(this.registrationDeadline, hackathonDto.registrationDeadline) &&
        Objects.equals(this.registrationSuspended, hackathonDto.registrationSuspended) &&
        Objects.equals(this.organizer, hackathonDto.organizer) &&
        Objects.equals(this.focus, hackathonDto.focus) &&
        Objects.equals(this.targetAudience, hackathonDto.targetAudience) &&
        Objects.equals(this.participationConditions, hackathonDto.participationConditions) &&
        Objects.equals(this.prizePool, hackathonDto.prizePool) &&
        Objects.equals(this.location, hackathonDto.location) &&
        Objects.equals(this.hackathonLink, hackathonDto.hackathonLink) &&
        Objects.equals(this.customLink, hackathonDto.customLink) &&
        Objects.equals(this.telegram, hackathonDto.telegram) &&
        Objects.equals(this.registrationStatus, hackathonDto.registrationStatus) &&
        Objects.equals(this.teams, hackathonDto.teams) &&
        Objects.equals(this.participants, hackathonDto.participants) &&
        Objects.equals(this.createdAt, hackathonDto.createdAt) &&
        Objects.equals(this.creator, hackathonDto.creator) &&
        Objects.equals(this.hasApplied, hackathonDto.hasApplied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, nickname, imageLink, shortDescription, format, startDate, endDate, registrationStartDate, registrationDeadline, registrationSuspended, organizer, focus, targetAudience, participationConditions, prizePool, location, hackathonLink, customLink, telegram, registrationStatus, teams, participants, createdAt, creator, hasApplied);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HackathonDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    registrationStartDate: ").append(toIndentedString(registrationStartDate)).append("\n");
    sb.append("    registrationDeadline: ").append(toIndentedString(registrationDeadline)).append("\n");
    sb.append("    registrationSuspended: ").append(toIndentedString(registrationSuspended)).append("\n");
    sb.append("    organizer: ").append(toIndentedString(organizer)).append("\n");
    sb.append("    focus: ").append(toIndentedString(focus)).append("\n");
    sb.append("    targetAudience: ").append(toIndentedString(targetAudience)).append("\n");
    sb.append("    participationConditions: ").append(toIndentedString(participationConditions)).append("\n");
    sb.append("    prizePool: ").append(toIndentedString(prizePool)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    hackathonLink: ").append(toIndentedString(hackathonLink)).append("\n");
    sb.append("    customLink: ").append(toIndentedString(customLink)).append("\n");
    sb.append("    telegram: ").append(toIndentedString(telegram)).append("\n");
    sb.append("    registrationStatus: ").append(toIndentedString(registrationStatus)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    hasApplied: ").append(toIndentedString(hasApplied)).append("\n");
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


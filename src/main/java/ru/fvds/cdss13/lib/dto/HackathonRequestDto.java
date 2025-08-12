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

import javax.xml.validation.Schema;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * HackathonRequestDto
 */

public class HackathonRequestDto {

  private @Nullable String ownerNickname;

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
  private OffsetDateTime registrationDeadline;

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

  /**
   * Constructor with only required parameters
   */
  public HackathonRequestDto(String title, HackathonFormat format, OffsetDateTime startDate, OffsetDateTime endDate, OffsetDateTime registrationDeadline, String organizer, String focus, String targetAudience, RegistrationStatus registrationStatus) {
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

  public HackathonRequestDto ownerNickname(String ownerNickname) {
    this.ownerNickname = ownerNickname;
    return this;
  }

  /**
   * Никнейм создателя
   * @return ownerNickname
   */
  @Size(min = 1, max = 255) 
  @JsonProperty("ownerNickname")
  public String getOwnerNickname() {
    return ownerNickname;
  }

  public void setOwnerNickname(String ownerNickname) {
    this.ownerNickname = ownerNickname;
  }

  public HackathonRequestDto title(String title) {
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

  public HackathonRequestDto nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Уникальный никнейм хакатона
   * @return nickname
   */
  @Size(min = 1, max = 63) 
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public HackathonRequestDto imageLink(String imageLink) {
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

  public HackathonRequestDto shortDescription(String shortDescription) {
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

  public HackathonRequestDto format(HackathonFormat format) {
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

  public HackathonRequestDto startDate(OffsetDateTime startDate) {
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

  public HackathonRequestDto endDate(OffsetDateTime endDate) {
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

  public HackathonRequestDto registrationDeadline(OffsetDateTime registrationDeadline) {
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

  public HackathonRequestDto organizer(String organizer) {
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

  public HackathonRequestDto focus(String focus) {
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

  public HackathonRequestDto targetAudience(String targetAudience) {
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

  public HackathonRequestDto participationConditions(String participationConditions) {
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

  public HackathonRequestDto prizePool(String prizePool) {
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

  public HackathonRequestDto location(String location) {
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

  public HackathonRequestDto hackathonLink(String hackathonLink) {
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

  public HackathonRequestDto customLink(String customLink) {
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

  public HackathonRequestDto telegram(String telegram) {
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

  public HackathonRequestDto registrationStatus(RegistrationStatus registrationStatus) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HackathonRequestDto hackathonRequestDto = (HackathonRequestDto) o;
    return Objects.equals(this.ownerNickname, hackathonRequestDto.ownerNickname) &&
        Objects.equals(this.title, hackathonRequestDto.title) &&
        Objects.equals(this.nickname, hackathonRequestDto.nickname) &&
        Objects.equals(this.imageLink, hackathonRequestDto.imageLink) &&
        Objects.equals(this.shortDescription, hackathonRequestDto.shortDescription) &&
        Objects.equals(this.format, hackathonRequestDto.format) &&
        Objects.equals(this.startDate, hackathonRequestDto.startDate) &&
        Objects.equals(this.endDate, hackathonRequestDto.endDate) &&
        Objects.equals(this.registrationDeadline, hackathonRequestDto.registrationDeadline) &&
        Objects.equals(this.organizer, hackathonRequestDto.organizer) &&
        Objects.equals(this.focus, hackathonRequestDto.focus) &&
        Objects.equals(this.targetAudience, hackathonRequestDto.targetAudience) &&
        Objects.equals(this.participationConditions, hackathonRequestDto.participationConditions) &&
        Objects.equals(this.prizePool, hackathonRequestDto.prizePool) &&
        Objects.equals(this.location, hackathonRequestDto.location) &&
        Objects.equals(this.hackathonLink, hackathonRequestDto.hackathonLink) &&
        Objects.equals(this.customLink, hackathonRequestDto.customLink) &&
        Objects.equals(this.telegram, hackathonRequestDto.telegram) &&
        Objects.equals(this.registrationStatus, hackathonRequestDto.registrationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerNickname, title, nickname, imageLink, shortDescription, format, startDate, endDate, registrationDeadline, organizer, focus, targetAudience, participationConditions, prizePool, location, hackathonLink, customLink, telegram, registrationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HackathonRequestDto {\n");
    sb.append("    ownerNickname: ").append(toIndentedString(ownerNickname)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    registrationDeadline: ").append(toIndentedString(registrationDeadline)).append("\n");
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


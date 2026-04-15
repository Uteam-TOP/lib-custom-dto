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
import ru.fvds.cdss13.lib.dto.city.CityDto;
import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * HackathonDto
 */

public class HackathonDto {

  private Long id;
  private String title;
  private String nickname;
  private String imageLink;
  private String shortDescription;
  private HackathonFormat format;
  private OffsetDateTime startDate;
  private OffsetDateTime endDate;
  private OffsetDateTime registrationStartDate;
  private OffsetDateTime registrationDeadline;
  private Boolean registrationSuspended;
  private String organizer;
  private String focus;
  private String targetAudience;
  private String participationConditions;
  private String prizePool;
  private String location;
  private String hackathonLink;
  private String customLink;
  private String telegram;
  private RegistrationStatus registrationStatus;
  private CityDto city;
  private OffsetDateTime createdAt;
  private String hackathonLogo;

  public String getHackathonLogo() {
    return hackathonLogo;
  }

  public void setHackathonLogo(String hackathonLogo) {
    this.hackathonLogo = hackathonLogo;
  }

  public HackathonDto() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public HackathonFormat getFormat() {
    return format;
  }

  public void setFormat(HackathonFormat format) {
    this.format = format;
  }

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public OffsetDateTime getRegistrationStartDate() {
    return registrationStartDate;
  }

  public void setRegistrationStartDate(OffsetDateTime registrationStartDate) {
    this.registrationStartDate = registrationStartDate;
  }

  public OffsetDateTime getRegistrationDeadline() {
    return registrationDeadline;
  }

  public void setRegistrationDeadline(OffsetDateTime registrationDeadline) {
    this.registrationDeadline = registrationDeadline;
  }

  public Boolean getRegistrationSuspended() {
    return registrationSuspended;
  }

  public void setRegistrationSuspended(Boolean registrationSuspended) {
    this.registrationSuspended = registrationSuspended;
  }

  public String getOrganizer() {
    return organizer;
  }

  public void setOrganizer(String organizer) {
    this.organizer = organizer;
  }

  public String getFocus() {
    return focus;
  }

  public void setFocus(String focus) {
    this.focus = focus;
  }

  public String getTargetAudience() {
    return targetAudience;
  }

  public void setTargetAudience(String targetAudience) {
    this.targetAudience = targetAudience;
  }

  public String getParticipationConditions() {
    return participationConditions;
  }

  public void setParticipationConditions(String participationConditions) {
    this.participationConditions = participationConditions;
  }

  public String getPrizePool() {
    return prizePool;
  }

  public void setPrizePool(String prizePool) {
    this.prizePool = prizePool;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getHackathonLink() {
    return hackathonLink;
  }

  public void setHackathonLink(String hackathonLink) {
    this.hackathonLink = hackathonLink;
  }

  public String getCustomLink() {
    return customLink;
  }

  public void setCustomLink(String customLink) {
    this.customLink = customLink;
  }

  public String getTelegram() {
    return telegram;
  }

  public void setTelegram(String telegram) {
    this.telegram = telegram;
  }

  public RegistrationStatus getRegistrationStatus() {
    return registrationStatus;
  }

  public void setRegistrationStatus(RegistrationStatus registrationStatus) {
    this.registrationStatus = registrationStatus;
  }

  public CityDto getCity() {
    return city;
  }

  public void setCity(CityDto city) {
    this.city = city;
  }

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
}


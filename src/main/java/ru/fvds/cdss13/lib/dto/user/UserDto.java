package ru.fvds.cdss13.lib.dto.user;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import ru.fvds.cdss13.lib.dto.city.CityDto;
import ru.fvds.cdss13.lib.dto.tag.TagDto;

import java.time.OffsetDateTime;
import java.util.Set;


public class UserDto {

    private Long id;

    private String firstName;

    private String lastName;

    private Gender gender;

    @Min(1)
    private Integer age;

    /**
     * Кейсы пользователя
     */
    private String freeLink;

    private String ownLink;

    @Size(max = 700)
    private String aboutMe;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OffsetDateTime dateOfRegistration;

    private CityDto cityEntityOfResidence;

    private String nickname;

//    @Pattern(regexp = "^\\$.*")
    private String telegram;

    private boolean hideTelegram;

    private String email;
    private String password;

    private boolean hideEmail;
    private boolean verifiedEmail;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private UserRole role;

    @Size(max = 200)
    private String imageLink;

    private boolean banned;
    private String banReason;

    private EmploymentStatus employmentStatus;

    private UserActivityStatus activityStatus;

    private Set<TagDto> userSkills;

    public UserDto() {
    }

    public Set<TagDto> getUserSkills() {
        return userSkills;
    }

    public void setUserSkills(Set<TagDto> userSkills) {
        this.userSkills = userSkills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFreeLink() {
        return freeLink;
    }

    public void setFreeLink(String freeLink) {
        this.freeLink = freeLink;
    }

    public String getOwnLink() {
        return ownLink;
    }

    public void setOwnLink(String ownLink) {
        this.ownLink = ownLink;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public OffsetDateTime getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(OffsetDateTime dateOfRegistration) {
            this.dateOfRegistration = dateOfRegistration;
    }

    public CityDto getCityEntityOfResidence() {
        return cityEntityOfResidence;
    }

    public void setCityEntityOfResidence(CityDto cityEntityOfResidence) {
        this.cityEntityOfResidence = cityEntityOfResidence;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public boolean isHideTelegram() {
        return hideTelegram;
    }

    public void setHideTelegram(boolean hideTelegram) {
        this.hideTelegram = hideTelegram;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isHideEmail() {
        return hideEmail;
    }

    public void setHideEmail(boolean hideEmail) {
        this.hideEmail = hideEmail;
    }

    public boolean isVerifiedEmail() {
        return verifiedEmail;
    }

    public void setVerifiedEmail(boolean verifiedEmail) {
        this.verifiedEmail = verifiedEmail;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public String getBanReason() {
        return banReason;
    }

    public void setBanReason(String banReason) {
        this.banReason = banReason;
    }

    public EmploymentStatus getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public UserActivityStatus getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(UserActivityStatus activityStatus) {
        this.activityStatus = activityStatus;
    }
}

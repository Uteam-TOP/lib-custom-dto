package ru.fvds.cdss13.lib.dto.ad;


import com.fasterxml.jackson.annotation.JsonIgnore;
import ru.fvds.cdss13.lib.dto.tag.TagDto;
import ru.fvds.cdss13.lib.dto.user.EmploymentStatus;
import ru.fvds.cdss13.lib.dto.user.Gender;
import ru.fvds.cdss13.lib.dto.user.UserActivityStatus;

import java.time.OffsetDateTime;
import java.util.Set;


public class AdFilterDto {
    private String searchText;
    private Long userId;
    private Set<UserActivityStatus> userActivityStatuses;
    private Set<EmploymentStatus> userEmploymentStatuses;
    private Set<Gender> genders;
    private Integer ageGte;
    private Integer ageLte;
    private Integer paymentGte;
    private Set<Long> cityIds;
    private Set<Long> regionIds;
    private Set<Long> districtIds;
    private Set<TagDto> tags;
    private Set<VisibilityLevel> visibilities;
    private OffsetDateTime creationDateGte;
    private OffsetDateTime creationDateLte;


    public AdType getAdType() {
        throw new RuntimeException("Тип объявления не задан");
    }

    public AdFilterDto() {
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Set<UserActivityStatus> getUserActivityStatuses() {
        return userActivityStatuses;
    }

    public void setUserActivityStatuses(Set<UserActivityStatus> userActivityStatuses) {
        this.userActivityStatuses = userActivityStatuses;
    }

    public Set<EmploymentStatus> getUserEmploymentStatuses() {
        return userEmploymentStatuses;
    }

    public void setUserEmploymentStatuses(Set<EmploymentStatus> userEmploymentStatuses) {
        this.userEmploymentStatuses = userEmploymentStatuses;
    }

    public Set<Gender> getGenders() {
        return genders;
    }

    public void setGenders(Set<Gender> genders) {
        this.genders = genders;
    }

    public Integer getAgeGte() {
        return ageGte;
    }

    public void setAgeGte(Integer ageGte) {
        this.ageGte = ageGte;
    }

    public Integer getAgeLte() {
        return ageLte;
    }

    public void setAgeLte(Integer ageLte) {
        this.ageLte = ageLte;
    }

    public Integer getPaymentGte() {
        return paymentGte;
    }

    public void setPaymentGte(Integer paymentGte) {
        this.paymentGte = paymentGte;
    }

    public Set<Long> getCityIds() {
        return cityIds;
    }

    public void setCityIds(Set<Long> cityIds) {
        this.cityIds = cityIds;
    }

    public Set<Long> getRegionIds() {
        return regionIds;
    }

    public void setRegionIds(Set<Long> regionIds) {
        this.regionIds = regionIds;
    }

    public Set<Long> getDistrictIds() {
        return districtIds;
    }

    public void setDistrictIds(Set<Long> districtIds) {
        this.districtIds = districtIds;
    }

    public Set<TagDto> getTags() {
        return tags;
    }

    public void setTags(Set<TagDto> tags) {
        this.tags = tags;
    }

    public Set<VisibilityLevel> getVisibilities() {
        return visibilities;
    }

    public void setVisibilities(Set<VisibilityLevel> visibilities) {
        this.visibilities = visibilities;
    }

    public OffsetDateTime getCreationDateGte() {
        return creationDateGte;
    }

    public void setCreationDateGte(OffsetDateTime creationDateGte) {
        this.creationDateGte = creationDateGte;
    }

    public OffsetDateTime getCreationDateLte() {
        return creationDateLte;
    }

    public void setCreationDateLte(OffsetDateTime creationDateLte) {
        this.creationDateLte = creationDateLte;
    }
}

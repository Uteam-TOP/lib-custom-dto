package ru.fvds.cdss13.lib.dto.application;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import ru.fvds.cdss13.lib.dto.ad.AdDto;

import java.time.OffsetDateTime;


public class ApplicationDto {

    private Long id;

    @Size(max = 600)
    private String coverLetter;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OffsetDateTime createdAt;

    @Valid
    private AdDto resume;

    public ApplicationDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public AdDto getResume() {
        return resume;
    }

    public void setResume(AdDto resume) {
        this.resume = resume;
    }
}

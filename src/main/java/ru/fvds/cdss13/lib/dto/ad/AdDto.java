package ru.fvds.cdss13.lib.dto.ad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.fvds.cdss13.lib.dto.project.ProjectDto;
import ru.fvds.cdss13.lib.dto.tag.TagDto;
import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdDto {

    private Long id;

    @NotBlank
    private String title;

    @Valid
    private UserDto user;

    @Valid
    @NotNull
    private TagDto profession;

    @Valid
    @NotNull
    private Set<TagDto> skills;

    @Valid
    @NotNull
    private Set<TagDto> motivations;

    private Integer minPayment;

    @Size(max = 700)
    private String details;

    private VisibilityLevel visibility;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OffsetDateTime creationDate;

    private String banReason;

    @JsonIgnore
    public AdType getAdType() {
        throw new RuntimeException("Тип объявления не задан");
    }

    private ProjectDto projectDto;

    @JsonIgnore
    public Set<TagDto> getTags() {
        Set<TagDto> tags = new HashSet<>(skills);
        tags.add(profession);
        tags.addAll(motivations);
        return tags;
    }


}

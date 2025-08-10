package ru.fvds.cdss13.lib.dto.project;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import ru.fvds.cdss13.lib.dto.ad.VacancyDto;
import ru.fvds.cdss13.lib.dto.city.CityDto;
import ru.fvds.cdss13.lib.dto.teammember.TeamMemberDto;
import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants(innerTypeName = "F")
public class ProjectDto {

    private Long id;

    @Size(min = 2, max = 32)
    private String nickname;

    @Size(min = 2, max = 32)
    private String telegram;

    @Email
    private String email;

    @Size(max = 200)
    private String title;

    @Size(max = 300)
    private String summary;

    @Size(max = 1500)
    private String description;

    @Size(max = 1500)
    private String developmentStage;

    @Size(max = 1500)
    private String tasks;

    private ProjectType type;

    @Size(max = 200)
    private String avatarLink;

    @Size(max = 200)
    private String headerLink;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private int likesCount;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private boolean userLike;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OffsetDateTime createdAt;

    @Valid
    private List<VacancyDto> vacancies;

    @Valid
    private UserDto owner;

    @Valid
    private List<TeamMemberDto> team;

    @Valid
    private CityDto city;
}

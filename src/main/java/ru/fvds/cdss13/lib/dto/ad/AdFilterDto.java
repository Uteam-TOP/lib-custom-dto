package ru.fvds.cdss13.lib.dto.ad;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.fvds.cdss13.lib.dto.tag.TagDto;
import ru.fvds.cdss13.lib.dto.user.EmploymentStatus;
import ru.fvds.cdss13.lib.dto.user.Gender;
import ru.fvds.cdss13.lib.dto.user.UserActivityStatus;

import java.time.OffsetDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @JsonIgnore
    public AdType getAdType() {
        throw new RuntimeException("Тип объявления не задан");
    }

}

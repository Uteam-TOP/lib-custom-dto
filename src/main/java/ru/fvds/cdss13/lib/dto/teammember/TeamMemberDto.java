package ru.fvds.cdss13.lib.dto.teammember;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants(innerTypeName = "F")
public class TeamMemberDto {
    private Long id;

    @Size(max = 200)
    private String profession;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OffsetDateTime createdAt;

    @Valid
    private UserDto user;
}

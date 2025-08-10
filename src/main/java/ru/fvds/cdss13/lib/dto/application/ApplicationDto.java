package ru.fvds.cdss13.lib.dto.application;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import ru.fvds.cdss13.lib.dto.ad.ResumeDto;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants(innerTypeName = "F")
public class ApplicationDto {

    private Long id;

    @Size(max = 600)
    private String coverLetter;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OffsetDateTime createdAt;

    @Valid
    private ResumeDto resume;
}

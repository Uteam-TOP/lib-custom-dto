package ru.fvds.cdss13.lib.dto.application;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldNameConstants;
import ru.fvds.cdss13.lib.dto.ad.AdDto;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ApplicationDto {

    private Long id;

    @Size(max = 600)
    private String coverLetter;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OffsetDateTime createdAt;

    @Valid
    private AdDto resume;
}

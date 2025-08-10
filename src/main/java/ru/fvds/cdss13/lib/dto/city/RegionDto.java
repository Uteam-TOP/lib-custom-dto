package ru.fvds.cdss13.lib.dto.city;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegionDto {
    private Long id;
    private String name;
    private DistrictDto district;
}

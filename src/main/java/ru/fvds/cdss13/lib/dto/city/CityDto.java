package ru.fvds.cdss13.lib.dto.city;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityDto {
    private Long id;
    private String name;
    private RegionDto region;
}

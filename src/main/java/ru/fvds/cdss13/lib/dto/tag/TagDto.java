package ru.fvds.cdss13.lib.dto.tag;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TagDto {

    private Long id;

    private String name;

    private String nameEng;

    @Min(1)
    @Max(3)
    private Integer competenceLevel;

    private TagType type;

    private String color;
}

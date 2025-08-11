package ru.fvds.cdss13.lib.dto;


import lombok.*;
import lombok.experimental.FieldNameConstants;
import ru.fvds.cdss13.lib.dto.project.ProjectDto;
import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PostDto {

    private Long id;
    private String title;
    private String imageLink;
    private String content;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private ProjectDto project;
    private UserDto author;
}

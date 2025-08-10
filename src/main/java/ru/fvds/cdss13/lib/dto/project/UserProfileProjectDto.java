package ru.fvds.cdss13.lib.dto.project;


import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class UserProfileProjectDto {
    private Long id;
    private String nickname;
    private String title;
    private Long userId;
    private String userProfession;
    private OffsetDateTime createdAt;
    private boolean isOwner;
}

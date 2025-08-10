package ru.fvds.cdss13.lib.dto.user;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.fvds.cdss13.lib.dto.city.CityDto;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;

    private String firstName;

    private String lastName;

    private Gender gender;

    @Min(1)
    private Integer age;

    /**
     * Кейсы пользователя
     */
    private String freeLink;

    private String ownLink;

    @Size(max = 700)
    private String aboutMe;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OffsetDateTime dateOfRegistration;

    private CityDto cityEntityOfResidence;

    private String nickname;

    @Pattern(regexp = "^\\$.*")
    private String telegram;

    private boolean hideTelegram;

    private String email;
    private String password;

    private boolean hideEmail;
    private boolean verifiedEmail;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private UserRole role;

    @Size(max = 200)
    private String imageLink;

    private boolean banned;
    private String banReason;

    private EmploymentStatus employmentStatus;

    private UserActivityStatus activityStatus;
}

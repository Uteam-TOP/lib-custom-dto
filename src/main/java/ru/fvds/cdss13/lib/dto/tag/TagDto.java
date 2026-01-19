package ru.fvds.cdss13.lib.dto.tag;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.util.HashSet;
import java.util.Set;


public class TagDto {

    private Long id;

    private String name;

    private String nameEng;

    @Min(1)
    @Max(3)
    private Integer competenceLevel;

    private TagType type;

    private String color;

    private Set<UserDto> users;

    public TagDto() {
    }

    public Set<UserDto> getUsers() {
        return users;
    }

    public void setUsers(Set<UserDto> users) {
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    public Integer getCompetenceLevel() {
        return competenceLevel;
    }

    public void setCompetenceLevel(Integer competenceLevel) {
        this.competenceLevel = competenceLevel;
    }

    public TagType getType() {
        return type;
    }

    public void setType(TagType type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

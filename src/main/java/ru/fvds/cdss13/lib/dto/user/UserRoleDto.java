package ru.fvds.cdss13.lib.dto.user;

public class UserRoleDto {

    private Long id;
    private String role;

    public UserRoleDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

package ru.fvds.cdss13.lib.dto.user;

public enum UserRole {
    ROOT,
    ADMIN,
    USER;

    public boolean isAdmin() {
        return this == ADMIN || this == ROOT;
    }
}


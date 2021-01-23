package com.epam;

public enum Role {
    ADMIN("an admin"),
    USER("an user"),
    MODERATOR("a moder");

    private String description;
    public String getDescription() {
        return description;
    }

    Role(String description) {
        this.description = description;
    }
}

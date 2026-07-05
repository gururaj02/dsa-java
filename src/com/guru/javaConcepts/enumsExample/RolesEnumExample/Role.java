package com.guru.javaConcepts.enumsExample.RolesEnumExample;

public enum Role implements Permission {
    ADMIN("Admin User", 1) {
        @Override
        public boolean isAllowed() {
            return true;
        }
    },

    USER("Normal User", 2) {
        @Override
        public boolean isAllowed() {
            return false;
        }
    };

    private final String description;
    private final int priority;

    Role(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public static Role forName(String name) {
        for (Role role : Role.values()) {
            if (role.name().equalsIgnoreCase(name)) {
                return role;
            }
        }
        throw new IllegalArgumentException("No such role");
    }
}

package com.guru.javaConcepts.enumsExample.RolesEnumExample;

import java.util.Arrays;

public class EnumRolesExample {
    public static void main(String[] args) {
        String adminDescription = Role.ADMIN.getDescription();
        int adminPriority = Role.ADMIN.getPriority();
        System.out.println("Role: " + Role.ADMIN + ", Description: " + adminDescription + ", Priority: " + adminPriority);

        System.out.println(Role.forName("USER"));

        System.out.println(Role.valueOf("ADMIN"));

        System.out.println(Arrays.toString(Role.values()));

        System.out.println("Is ADMIN allowed? " + Role.ADMIN.isAllowed());
        System.out.println("Is USER allowed? " + Role.USER.isAllowed());
    }
}

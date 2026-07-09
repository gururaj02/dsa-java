package com.guru.javaConcepts.immutableClass;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2003, Month.FEBRUARY, 2);
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        // Here DOB is type of Date
        ImmutableUser user = new ImmutableUser("Guru", date);

        System.out.println("Username: " + user.getUsername());
        System.out.println("Date of Birth: " + user.getDateOfBirth());
    }
}

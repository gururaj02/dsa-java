package com.guru.javaConcepts.immutableClass;

import java.util.Date;

public final class ImmutableUser { // 1.make class final

    private final String username; // 2.Make fields private final
    private final Date dateOfBirth; // Mutable field
    // If we use LocalDate No defensive copy needed! because LocalDate is already immutable

    public ImmutableUser(String username, Date dateOfBirth) {
        this.username = username;
        // 3.Perform defensive copy for mutable objects
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    // 4.No Setter
    public String getUsername() {
        return username;
    }

    public Date getDateOfBirth() {
        // 5.Return the copy not the original reference
        return new Date(dateOfBirth.getTime());
    }
}


//package com.guru.javaConcepts.immutableClass;
//
//import java.time.LocalDate;
//
//// 1. Made the class final
//public final class ImmutableUser {
//
//    // 2. Made the fields final
//    private final String username;
//    private final LocalDate dateOfBirth;
//
//    public ImmutableUser(String username, LocalDate dateOfBirth) {
//        this.username = username;
//        this.dateOfBirth = dateOfBirth; // No defensive copy needed!
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public LocalDate getDateOfBirth() {
//        return dateOfBirth; // Directly safe to return
//    }
//}


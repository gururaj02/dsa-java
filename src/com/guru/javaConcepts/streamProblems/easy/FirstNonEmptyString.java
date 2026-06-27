package com.guru.javaConcepts.streamProblems.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstNonEmptyString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("", "", "Hello", "World", "");

        Optional<String> string = strings.stream()
                .filter(str -> !str.isEmpty()) // .filter(str -> !str.trim().isEmpty()) for java 8+ -OR- .filter(str -> !str.isBlank()) for java 11+
                .findFirst();

        System.out.println("First non-empty string: " + string.get());
    }
}

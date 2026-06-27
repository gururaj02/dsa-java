package com.guru.javaConcepts.streamProblems.easy;

import java.util.Arrays;
import java.util.List;

public class AllPositiveExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, -3, 4, 5);

        boolean match = numbers.stream()
                .allMatch(number -> number > 0);

        System.out.println("Are all numbers positive? " + match);
    }
}

package com.guru.javaConcepts.streamProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNumberGraterThan {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 12, 5, 11, 20);

        Optional<Integer> first = numbers.stream()
                .filter(number -> number > 10) // 12, 11, 20
                .sorted()
                .findFirst();

        System.out.println("First number greater than 10 is: " + first.get());
    }
}

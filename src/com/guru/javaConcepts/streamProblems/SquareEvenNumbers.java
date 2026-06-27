package com.guru.javaConcepts.streamProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .toList();

        System.out.println("Squared even numbers: " + result);
    }
}

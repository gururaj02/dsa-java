package com.guru.javaConcepts.streamProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEvenNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


        Stream<Integer> stream = numbers.stream();
        List<Integer> result = stream.filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + result);

        // -OR-

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));
    }
}

package com.guru.javaConcepts.streamProblems.superEasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EvenSquaredSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> evenNumberSquaredSum = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .reduce(Integer::sum); // .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of squares of even numbers: " + evenNumberSquaredSum.get());
    }
}

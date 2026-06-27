package com.guru.javaConcepts.streamProblems.superEasy;

import java.util.Arrays;
import java.util.List;

public class SumEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Integer sumOfEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of even numbers: " + sumOfEven);
    }
}

package com.guru.javaConcepts.streamProblems.superEasy;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Integer sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of elements: " + sum);

        Integer product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product of elements: " + product);
    }
}

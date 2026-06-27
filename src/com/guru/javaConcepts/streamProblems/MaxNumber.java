package com.guru.javaConcepts.streamProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 2, 8, 20);

        Optional<Integer> max = numbers.stream()
                .reduce((a, b) -> Integer.max(a, b));

        System.out.println("Max: " + max.orElse(null));
    }
}

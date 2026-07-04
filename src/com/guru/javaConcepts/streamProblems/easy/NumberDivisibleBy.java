package com.guru.javaConcepts.streamProblems.easy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NumberDivisibleBy {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 7, 9, 10, 14);

        boolean match = numbers.stream()
                .anyMatch(number -> number % 3 == 0);

        System.out.println("Is there any number divisible by 3? - " + match);
    }
}

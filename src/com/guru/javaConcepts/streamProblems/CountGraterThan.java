package com.guru.javaConcepts.streamProblems;

import java.util.Arrays;
import java.util.List;

public class CountGraterThan {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        long count = numbers.stream()
                .filter(number -> number > 5)
                .count();

        System.out.println("Count: " + count);
    }
}

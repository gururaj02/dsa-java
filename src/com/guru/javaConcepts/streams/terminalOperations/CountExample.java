package com.guru.javaConcepts.streams.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class CountExample {

    public static void main(String[] args) {

        // Count the no of items
        List<Integer> numbers = Arrays.asList(3, 4, 1, 5, 6, 9);

        long count = numbers.stream()
                .count();

        System.out.println("Count: " + count);
    }
}

package com.guru.javaConcepts.streams.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {

    public static void main(String[] args) {

        // Find the first even number in a list of integers
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8, 9, 10);

        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        System.out.println("First even number: " + firstEven.get());
    }
}

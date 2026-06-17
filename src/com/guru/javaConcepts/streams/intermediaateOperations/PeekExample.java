package com.guru.javaConcepts.streams.intermediaateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        final List<Integer> squaredList = numbers.stream()
                .peek(number -> System.out.println("Before filter: " + number))
                .map(number -> number * number)
                .peek(number -> System.out.println("After filter: " + number))
                .collect(Collectors.toList());

        System.out.println("Squared list: " + squaredList);
    }
}

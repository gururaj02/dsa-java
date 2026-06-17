package com.guru.javaConcepts.streams.intermediaateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {

    public static void main(String[] args) {
        // by default ascending order it will sort
        // Example 1: Sorting a list of integers
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        System.out.println("Sorted numbers:");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        // Sorting in reverse order
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // Example 2: Sorting a list of strings
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        System.out.println("\nSorted names:");
        names.stream()
                .sorted()
                .forEach(System.out::println);

        // Sorting based on String length
        List<String> sortedWordsByLength = names.stream()
                .sorted(Comparator.comparingInt(String::length))
                // .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();
        sortedWordsByLength.forEach(System.out::println);

    }
}

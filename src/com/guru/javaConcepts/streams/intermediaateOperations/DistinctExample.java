package com.guru.javaConcepts.streams.intermediaateOperations;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}

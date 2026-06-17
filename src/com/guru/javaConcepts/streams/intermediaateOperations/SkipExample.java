package com.guru.javaConcepts.streams.intermediaateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        final List<Integer> listAfterSkipped = numbers.stream()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println(listAfterSkipped);
    }
}

package com.guru.javaConcepts.streams.terminalOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 1, 4, 9, 5);

        // Find minimum
        Optional<Integer> min = numbers.stream()
                .min(Comparator.naturalOrder());

        System.out.println(min.get());
        // System.out.println(min);


        // Find maximum
        Optional<Integer> max = numbers.stream()
                .max(Comparator.naturalOrder());

        System.out.println(max.get());
        // System.out.println(max);
    }
}

package com.guru.javaConcepts.streams.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class SumExample {

    public static void main(String[] args) {

        // Sum the numbers in a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                // .mapToInt(n -> n.intValue())
                .sum();

        System.out.println("Sum : " + sum);
    }
}

package com.guru.javaConcepts.streams.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {

    public static void main(String[] args) {

        // Find whether is num is present or not
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8, 9, 10);

        boolean b = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println("Is there any even number? " + b);
    }
}

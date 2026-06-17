package com.guru.javaConcepts.streams.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {

    public static void main(String[] args) {

        // Example of using collect() to gather stream elements into a collection
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenSquaredList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(evenSquaredList);
    }
}

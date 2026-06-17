package com.guru.javaConcepts.streams.intermediaateOperations;

import java.util.Arrays;
import java.util.List;

public class FaltMapExample {
    public static void main(String[] args) {

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );

        listOfLists.stream()
                .flatMap(list -> list.stream())
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

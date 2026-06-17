package com.guru.javaConcepts.streams.intermediaateOperations;

import java.util.Arrays;
import java.util.List;

public class MapExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("alice", "bob", "charlie");

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);
    }
}

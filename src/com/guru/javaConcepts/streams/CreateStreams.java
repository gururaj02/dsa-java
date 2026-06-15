package com.guru.javaConcepts.streams;

import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob");

        // 1. List -> Stream
        Stream<String> streams =  names.stream();
        streams.forEach(name -> System.out.println(name));

        String[] arr = {"Alice", "Bob"};
        // 2. Array -> Stream
        Stream<String> stream = Stream.of(arr);
        stream.forEach(name -> System.out.println(name));
    }
}

package com.guru.javaConcepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class CreateStreams {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob");

        // 1. List -> Stream
        Stream<String> streams =  names.stream();
        streams.forEach(name -> System.out.println(name));

        String[] arr = {"Java", "Python", "C++"};
        // 2. Array -> Stream
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(name -> System.out.println(name));
        
        // 3. Stream of
        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        // 4. stream generate
        Stream<Double> limit = Stream.generate(() -> Math.random()).limit(5);
        // Stream<Double> limit = Stream.generate(Math::random).limit(5);
    }
}

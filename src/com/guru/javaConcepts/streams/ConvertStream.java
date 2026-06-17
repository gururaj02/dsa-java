package com.guru.javaConcepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertStream {
    public static void main(String[] args) {

        // Primitive Array
        int[] primitiveArray = {1, 2, 3, 4};

        // Object array
        Integer[] objectArray = {1, 2, 3, 4};

        // 1. Convert primitive array to Stream
        final IntStream intStream = Arrays.stream(primitiveArray);
        intStream.forEach(System.out::println);

        // 2. Convert Object Array to Stream
        final Stream<Integer> stream = Arrays.stream(objectArray);
        stream.forEach(System.out::println);
//        final IntStream stream = Arrays.stream(objectArray).mapToInt(Integer::intValue);
//        stream.forEach(System.out::println);

        // 4. Convert List to Stream
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        integerList.stream()
                .forEach(System.out::println);


    }
}

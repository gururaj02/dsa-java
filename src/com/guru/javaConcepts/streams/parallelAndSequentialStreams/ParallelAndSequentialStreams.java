package com.guru.javaConcepts.streams.parallelAndSequentialStreams;

import java.util.Arrays;

public class ParallelAndSequentialStreams {
    public static void main(String[] args) {
        int[] intArray = new int[1000000];
        Arrays.fill(intArray, 2);

        // Calculate sum of squares using sequential stream
        long startTime = System.currentTimeMillis();
        final int sequentialSum = Arrays.stream(intArray)
                .map(n -> n * n)
                .sum();
        long endTime = System.currentTimeMillis();
        System.out.println("sequentialStreamSum = " + sequentialSum);
        System.out.println("Time taken by sequential stream: " + (endTime - startTime) + "ms");

        // Calculate sum of squares using parallel stream
        startTime = System.currentTimeMillis();
        final int parallelSum = Arrays.stream(intArray)
                .parallel()
                .map(n -> n * n)
                .sum();
        endTime = System.currentTimeMillis();
        System.out.println("parallelStreamSum = " + parallelSum);
        System.out.println("Time taken by parallel stream: " + (endTime - startTime) + "ms");
    }
}

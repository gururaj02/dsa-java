package com.guru.javaConcepts.streams.parallelAndSequentialStreams;

import java.util.Arrays;
import java.util.stream.LongStream;

public class FactorialParallelAndSequentialStreams {
    public static void main(String[] args) {
        long[] longArray = new long[20000];
        for(int i = 0; i < longArray.length; i++) {
            longArray[i] = i + 1;
        }

        // Calculate sum of factorials using sequential stream
        long startTime = System.currentTimeMillis();
        long sequentialStreamSum = Arrays.stream(longArray)
                .map(FactorialParallelAndSequentialStreams::factorial)
                .sum();
        long endTime = System.currentTimeMillis();
        System.out.println("sequentialStreamSum = " + sequentialStreamSum);
        System.out.println("Time taken by sequential stream: " + (endTime - startTime) + "ms");


        // Calculate sum of factorials using parallel stream
        startTime = System.currentTimeMillis();
        long parallelStreamSum = Arrays.stream(longArray)
                .parallel()
                .map(n -> factorial(n))
                .sum();
        endTime = System.currentTimeMillis();
        System.out.println("parallelStreamSum = " + parallelStreamSum);
        System.out.println("Time taken by parallel stream: " + (endTime - startTime) + "ms");
    }

    // Method to calculate factorial of a number
    public static long factorial(long number) {
        return LongStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);
    }
}

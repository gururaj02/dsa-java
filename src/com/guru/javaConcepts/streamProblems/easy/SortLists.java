package com.guru.javaConcepts.streamProblems.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortLists {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 5, 2, 1, 1, 8, 1, 3);

        List<Integer> sortedNumbers = numbers.stream()
                .distinct()
                // .sorted() // by default, it's ascending order
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Sorted numbers: " + sortedNumbers);
    }
}

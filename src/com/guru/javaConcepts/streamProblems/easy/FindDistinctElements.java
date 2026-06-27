package com.guru.javaConcepts.streamProblems.easy;

import java.util.Arrays;
import java.util.List;

public class FindDistinctElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 3, 5, 9, 3);

        List<Integer> distinct = numbers.stream()
                .distinct()
                .toList();
        System.out.println("Distinct elements: " + distinct);

//        Set<Integer> set = numbers.stream()
//                .collect(Collectors.toSet()); // order is not maintaining here
//        System.out.println("Distinct elements: " + set);
    }
}

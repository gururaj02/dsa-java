package com.guru.javaConcepts.streamProblems.easy;

import java.util.Arrays;
import java.util.List;

public class CountStartingWithA {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapefruit", "Avocado");

        List<String> fruitsStartsWithA = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .toList();
        System.out.println("Fruits starting with 'A': " + fruitsStartsWithA);

        long fruitsCountStartsWithA = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .count();
        System.out.println("Fruits counts starting with 'A': " + fruitsCountStartsWithA);
    }
}

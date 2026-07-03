package com.guru.javaConcepts.streamProblems.intermediate;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MostFrequentChar {
    public static void main(String[] args) {
        String input = "banana";

        // "banana" -> ['b', 'a', 'n', 'a', 'n', 'a']

        IntStream chars = input.chars();
        chars.forEach(c -> System.out.println(c));

        Map.Entry<Character, Long> characterLongEntry = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(characterLongEntry);
        System.out.println("Most frequent character: " + characterLongEntry.getKey() + " with count: " + characterLongEntry.getValue());
    }
}

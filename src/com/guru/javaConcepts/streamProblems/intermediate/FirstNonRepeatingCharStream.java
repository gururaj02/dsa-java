package com.guru.javaConcepts.streamProblems.intermediate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharStream {
    public static void main(String[] args) {
        String str = "swiss";

        Optional<Map.Entry<Character, Long>> first = str.chars()
                .mapToObj(c -> (char) c)
                // HashMap doesn't maintain insertion order so we should use LinkedHashMap to maintain the order of characters
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst();

        System.out.println(first);
    }
}

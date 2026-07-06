package com.guru.javaConcepts.builtinFunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> consumer = (msg) -> System.out.println(msg);
        consumer.accept("Hello");

        Consumer<String> upper = (s) -> System.out.println(s.toUpperCase());
        Consumer<String> length = (s) -> System.out.println(s.length());

        Consumer<String> result = upper.andThen(length);

        result.accept("java");
    }
}

package com.guru.javaConcepts.builtinFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> positive = number -> number > 0;

        Predicate<Integer> result = isEven.and(positive);

        System.out.println("Is 4 even and positive? " + result.test(4));
        System.out.println("Is 4 even and positive? " + result.test(-4));

        Predicate<Integer> negative = positive.negate();
        System.out.println("Is 4 even and positive? " + negative.test(4));
    }
}

package com.guru.javaConcepts.builtinFunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<Double, Double> convert = c -> c * 9 / 5 + 35;
        System.out.println("Temperature in Fahrenheit: " + convert.apply(100.0));


        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> add10 = x -> x + 10;

        Function<Integer, Integer> result = square.andThen(add10);
        Function<Integer, Integer> resultReverseOrder = square.compose(add10);

        System.out.println("Result of square and then add 10: " + result.apply(5));
        System.out.println("Result of add 10 and then square: " + resultReverseOrder.apply(5));
    }
}

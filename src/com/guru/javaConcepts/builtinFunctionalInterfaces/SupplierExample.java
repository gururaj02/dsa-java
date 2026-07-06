package com.guru.javaConcepts.builtinFunctionalInterfaces;

import java.util.UUID;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> greet = () -> "Hello";
        System.out.println(greet.get());

        Supplier<String> generateToken = () -> UUID.randomUUID().toString();
        System.out.println(generateToken.get());

        Supplier<Double> randomNumber = () -> Math.random() * 10;
        System.out.println(randomNumber.get());
    }
}

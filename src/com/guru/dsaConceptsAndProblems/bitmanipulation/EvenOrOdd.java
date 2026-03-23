package com.guru.dsaConceptsAndProblems.bitmanipulation;

public class EvenOrOdd {

    public static void main(String[] args) {

        int num = 68;

        System.out.println(isOdd(num));
    }

    private static boolean isOdd(int num) {
//        System.out.println(num & 1);
        return (num & 1) == 1;
    }
}

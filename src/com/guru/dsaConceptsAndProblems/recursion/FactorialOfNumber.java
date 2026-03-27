package com.guru.dsaConceptsAndProblems.recursion;

public class FactorialOfNumber {

    public static void main(String[] args) {

        int ans = factorial(2);

        System.out.println(ans);
    }

    public static int factorial(int num) {

        if(num <= 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }
}

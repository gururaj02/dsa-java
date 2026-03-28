package com.guru.dsaConceptsAndProblems.recursion;

public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println(sum(13425));
    }

    public static int sum(int num) {

        if(num == 0) {
            return 0;
        }

        return (num % 10) + sum(num / 10);
    }
}

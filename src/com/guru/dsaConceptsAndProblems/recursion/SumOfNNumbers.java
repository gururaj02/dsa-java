package com.guru.dsaConceptsAndProblems.recursion;

public class SumOfNNumbers {

    public static void main(String[] args) {
        int sum = sum(5);

        System.out.println(sum);
    }

    public static int sum(int num) {

        if(num <= 1) {
            return 1;
        }

        return num + sum(num - 1);
    }
}

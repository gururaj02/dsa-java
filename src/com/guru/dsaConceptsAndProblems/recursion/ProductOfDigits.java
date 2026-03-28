package com.guru.dsaConceptsAndProblems.recursion;

public class ProductOfDigits {

    public static void main(String[] args) {

        System.out.println(prod(505));
    }

    public static int prod(int num) {

        if(num % 10 == num) {
            return num;
        }

        return (num % 10) * prod(num / 10);
    }
}

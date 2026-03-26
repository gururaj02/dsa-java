package com.guru.dsaConceptsAndProblems.recursion;

public class NtoOne {

    public static void main(String[] args) {

        funReverse(5);
    }

    static void fun(int n) {
        if(n == 0) {
            return;
        }

        System.out.println(n); // 5, 4, 3, 2, 1
        fun(n - 1);
    }

    static void funReverse(int n) {
        if(n == 0) {
            return;
        }

        funReverse(n - 1);
        System.out.println(n); // 1, 2, 3, 4, 5
    }
}

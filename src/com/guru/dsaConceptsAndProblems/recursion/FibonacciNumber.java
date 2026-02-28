package com.guru.dsaConceptsAndProblems.recursion;

public class FibonacciNumber {

    public static void main(String[] args) {

        // using recursion
//        int ans = fibonacci(6);
//        System.out.println(ans);

        // Using formula
        System.out.println(fibonacciFormula(50));
//        for(int i = 0; i < 11; i++) {
//            System.out.println(fibonacciFormula(i));
//        }
    }

    static int fibonacci(int n) {

        if(n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static long fibonacciFormula(int n) {

//        return (int)((Math.pow(((1 + Math.sqrt(5)) / 2), n)) / Math.sqrt(5)); // you can use this formula also. Here less dominating terms are removed

        return (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }
}

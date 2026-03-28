package com.guru.dsaConceptsAndProblems.recursion;

public class ReverseNumber {

    // way - 1
    static int sum = 0;
    public static void reverse(int num) {

        if(num == 0) {
            return;
        }

        int rem = num % 10;
        sum = sum * 10 + rem;

        reverse(num / 10);

    }

    // Way - 2 (Using log)
    public static int reverse2(int num) {

        int digits = (int)Math.log10(num) + 1;

        return helper(num, digits);
    }
    private static int helper(int num, int digits) {
        if(num % 10 == num) {
            return num;
        }

        int rem = num % 10;

        return rem * (int)Math.pow(10, digits - 1) + helper(num / 10, digits - 1);
    }


    public static void main(String[] args) {

        reverse(43532);
        System.out.println(sum);

        System.out.println(reverse2(35432));
    }
}

package com.guru.dsaConceptsAndProblems.recursion;

import java.util.Scanner;

public class CountZeros {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = in.nextInt();

        System.out.println(count(num) + " zeros are there");
    }

    static int count(int num) {
        return helper(num, 0);
    }

    // special pattern - how to pass a value to above calls
    static int helper(int num, int count) {

        if(num == 0) {
            return count;
        }

        int rem = num % 10;

        if(rem == 0) {
            return helper(num / 10, count + 1);
        }
        else {
            return helper(num / 10, count);
        }
    }
}

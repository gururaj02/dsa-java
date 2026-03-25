package com.guru.dsaConceptsAndProblems.bitmanipulation;

public class PascalSum {

    public static void main(String[] args) {
        int n = 3;

        int sum = 1 << (n - 1);

        System.out.println(sum);
    }
}

/*
        1
      1   1
     1  2  1
   1   3  3  1

*/
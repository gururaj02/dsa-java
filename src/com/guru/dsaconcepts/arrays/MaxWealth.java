package com.guru.dsaconcepts.arrays;

public class MaxWealth {

    public static void main(String[] args) {

        int[][] arr = {
                {5, 2, 3},
                {2, 5, 1}
        };

        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] arr) {

        int maxWealth = Integer.MIN_VALUE;

        for(int person = 0; person < arr.length; person++) {

            int rowSum = 0;
            for(int accounts = 0; accounts < arr[person].length; accounts++) {
                rowSum += arr[person][accounts];
            }

            if(rowSum > maxWealth) {
                maxWealth = rowSum;
            }
        }

        return maxWealth;
    }
}

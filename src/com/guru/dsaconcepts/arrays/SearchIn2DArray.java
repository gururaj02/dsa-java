package com.guru.dsaconcepts.arrays;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {2, 4,56, 1},
                {23, 43},
                {12, 45, 99, 67, 33},
                {11, 2, 45}
        };
        int target = 67;
        System.out.println(Arrays.deepToString(arr));

        int[] ans = search(arr, target);

        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }

    public static int[] search(int[][] arr, int target) {

        if(arr.length == 0) {
            return new int[]{-1, -1};
        }

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {

                if(arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }

        return new int[] {-1, -1};
    }

    public static int max(int[][] arr) {

        int max = Integer.MIN_VALUE;

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {

                if(arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }

        return max;
    }
}

package com.guru.dsaconcepts.arrays;

import java.util.Arrays;

public class RowColMatrix {

    public static void main(String[] args) {

        // this array is not fully sorted, it's sorted like row wise and colum wise manner, so we can't apply binary search here
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 39;

        System.out.println(Arrays.toString(searchInMatrix(matrix, target)));
    }

    public static int[] searchInMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if(target < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }

        return new int[]{-1, -1};
    }
}

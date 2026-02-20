package com.guru.dsaConceptsAndProblems.arrays.binarysearch;

public class FindMin {

    public static void main(String[] args) {

        int[] arr = {34, 4, 23, 54, 55, 12, 5, 89, 21};

        System.out.println(min(arr));
    }

    public static int min(int[] arr) {

        if(arr.length == 0) {
            return -1;
        }

        int ans = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}

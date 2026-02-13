package com.guru.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {-5, 0, 30, -14, 21, -82};

        insertion(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;

            while(j > 0) {
                if(arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    j--;
                } else {
                    break;
                }
            }

            // We can use this for loop also instead of while loop
//            for(int j = i + 1; j > 0; j--) {
//                if(arr[j] < arr[j - 1]) {
//                    swap(arr, j, j - 1);
//                } else {
//                    break;
//                }
//            }

        }
    }

    public static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}

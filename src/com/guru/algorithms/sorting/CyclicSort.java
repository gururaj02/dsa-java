package com.guru.algorithms.sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};

        cyclic(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic(int[] arr) {

        int i = 0;

        while(i < arr.length) {

            int correctIndex = arr[i] - 1;

            if(arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }

        // this will not work for duplicate values. If duplicate values are there then it will enter an infinite loop
        /*
        while(i < arr.length) {
            if(arr[i] - 1 != i) {
                swap(arr, i, arr[i] - 1);
            }
            else {
                i++;
            }
        }
         */

    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

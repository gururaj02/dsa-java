package com.guru.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {2, -1, 23, -21, 32, -17, 0, -99};

        selection(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void selection(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with the correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxItem(arr, 0, last);

            swap(arr, maxIndex, last);

        }
    }

    public static void swap(int[] arr, int maxIndex, int last) {

        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    private static int getMaxItem(int[] arr, int start, int end) {
        int max = start;

        for(int i = start; i <= end; i++) {
            if(arr[i] > arr[max] ) {
                max = i;
            }
        }

        return max;
    }
}

package com.guru.dsaconcepts.arrays.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};

        System.out.println(cyclic(arr));

        System.out.println(cyclicAnotherMethod(arr));
    }

    public static int cyclic(int[] arr) {

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

        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                return arr[index];
            }
        }
        return -1;
    }

    // both are same. But in above function, first we are sorting then we are running for loop to find duplicate
    // Here we are initially checking i.e., (arr[i] != i+1)
    public static int cyclicAnotherMethod(int[] arr) {

        int i = 0;

        while(i < arr.length) {

            if(arr[i] != i + 1) {

                int correctIndex = arr[i] - 1;

                if(arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                }
                else {
                    return arr[i];
                }
            }
            else {
                i++;
            }
        }

        return -1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

package com.guru.dsaconcepts.arrays.cyclicsort;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {5, 0, 2, 1, 3};

        int missingNumber = cyclic(arr);

        System.out.println(missingNumber);
    }

    public static int cyclic(int[] arr) {

        int i = 0;

        while(i < arr.length) {
            int correctIndex = arr[i];

            if(correctIndex < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }

        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index) {
                return index;
            }
        }

        return arr.length; // if arr is [0, 1, 2, 3, 4] then we should return 5
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

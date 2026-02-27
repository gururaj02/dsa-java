package com.guru.dsaConceptsAndProblems.arrays.cyclicsort;

public class FindMissingPositive {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};

        System.out.println(cyclic(arr));
    }

    public static int cyclic(int[] arr) {

        int i = 0;

        while(i < arr.length) {
            int correctIndex = arr[i] - 1;

            if(arr[i] > 0 && correctIndex < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }

        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                return index + 1;
            }
        }

        return arr.length + 1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

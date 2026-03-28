package com.guru.dsaConceptsAndProblems.recursion.arrayquestions;

public class ArraySortedCheck {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 16, 8};

        System.out.println(isArraySorted(arr));
    }

    static boolean isArraySorted(int[] arr) {

        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int index) {

        if(index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && helper(arr, index + 1);
    }
}

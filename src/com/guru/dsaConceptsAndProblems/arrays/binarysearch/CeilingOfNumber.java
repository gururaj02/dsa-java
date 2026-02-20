package com.guru.dsaConceptsAndProblems.arrays.binarysearch;

public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = {-12, -8, -4, 0, 12, 23, 31, 42, 51, 68, 72, 83, 99, 100};
        int target = 12;

        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {

        // what if the target is greater than the greatest number in the array
        if(target > arr[arr.length -1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }

        }
        return start;
//        return end; // for floor of a number return this
    }
}

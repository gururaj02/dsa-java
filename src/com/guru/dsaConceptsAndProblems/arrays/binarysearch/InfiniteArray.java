package com.guru.dsaConceptsAndProblems.arrays.binarysearch;

public class InfiniteArray {

    // consider array has infinite elements, so don't use .length
    public static void main(String[] args) {

//        int[] arr = {1, 2, 4, 5, 6, 12, 23, 56, 67, 89};
//        int target = 23;
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return search(arr, target, start, end);
    }

    public static int search(int[] arr, int target, int start, int end) {

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                // fond ans, that is mid
                return mid;
            }

        }
        return -1;
    }
}

package com.guru.dsaconcepts.arrays;

public class SearchInMountainArray {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 7, 12, 11, 9, 4, 2, 0};
        int target = 12;

        System.out.println(search(arr, target));

    }

    public static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);

        int firstTry = orderAgnosticBinarySearch(arr, peak + 1, arr.length - 1, target);
        if(firstTry != -1) {
            return firstTry;
        }

        return orderAgnosticBinarySearch(arr, 0, peak, target);
    }

    // Find the peak element
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {

            // Find middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                // you are in the descending part of the array
                // this may be the answer, but look at left
                end = mid;
            }
            else {
                // you are in the ascending part of the array
                // there is no possibility that this is the ans, so look at right
                start = mid + 1;
            }
        }

        // in the end, start and end both are pointing to the same largest element so you can return start/end
        return start;
    }

    // apply BS for LHS and RHS of the peak
    public static int orderAgnosticBinarySearch(int[] arr, int start, int end, int target) {
//        int start = 0;
//        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {

            // Find middle element
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                // fond ans, that is mid
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}

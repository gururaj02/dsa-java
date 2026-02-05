package com.guru.dsaconcepts.arrays;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 8, 10, 12, 1, 2, 3};
        int target = 4;

//        System.out.println(findPivot(arr));
        System.out.println(findAns(arr, target));
    }

    private static int findAns(int[] arr, int target) {
        int pivot = findPivot(arr); // 5

        // If you did not find pivot, it means array is not rotated
        if(pivot == -1) {
            // So just do normal BS
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if(arr[pivot] == target) {
            return pivot;
        }

        if(arr[0] <= target) {
            return binarySearch(arr, target, 0, pivot);
        }
        else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    // This will not work in duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            else if(arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {

            // Find middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
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

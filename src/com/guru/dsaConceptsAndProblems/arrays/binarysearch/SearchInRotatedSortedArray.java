package com.guru.dsaConceptsAndProblems.arrays.binarysearch;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 8, 10, 12, 1, 2, 3};
        int target = 6;

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

    // This will work in duplicate values
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //If elements at middle, start, and end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // NOTE: what if these start and end elements were the pivot??
                // Check start whether it's pivot
                if(arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // Check end whether it's pivot
                if(arr[end] < arr[end - 1]) {
                    return end;
                }
                end--;
            }

            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

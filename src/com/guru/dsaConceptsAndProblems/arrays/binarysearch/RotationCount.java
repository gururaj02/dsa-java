package com.guru.dsaConceptsAndProblems.arrays.binarysearch;

public class RotationCount {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = {7, 8, 9, 1, 3, 4, 5, 6};

        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);

//        if(pivot == -1) {
//            return 0;
//        }

        return pivot + 1;
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

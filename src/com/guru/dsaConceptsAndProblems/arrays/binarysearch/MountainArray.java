package com.guru.dsaConceptsAndProblems.arrays.binarysearch;

public class MountainArray {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 6, 8, 5, 4, 3, 1, 0};

        System.out.println(peakIndexInMountainArray(arr));

    }

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
}

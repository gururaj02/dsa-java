package com.guru.dsaConceptsAndProblems.recursion;

public class BinarySearchWithRecursion {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 78;

        int ans = binarySearch(arr, 0, arr.length - 1, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int start, int end, int target) {

        if(start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(target == arr[mid]) {
            return mid;
        }

        if(arr[mid] < target) {
            return binarySearch(arr, mid + 1, end, target);
        }

        return binarySearch(arr, start, mid - 1, target);
    }
}

package com.guru.algorithms.searching;

public class OrderAgnosticBS {

    public static void main(String[] args) {
        int[] arrAsc = {-12, -8, -4, 0, 12, 23, 31, 42, 51, 68, 72, 83, 99, 100};
        int targetAsc = -8;

        int[] arrDsc = {98, 87, 75, 67, 55, 47, 32, 23, 11, 9, 2, 0, -1, -5, -20};
        int targetDsc = 55;

        System.out.println(search(arrAsc, targetAsc));
        System.out.println(search(arrDsc, targetDsc));
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

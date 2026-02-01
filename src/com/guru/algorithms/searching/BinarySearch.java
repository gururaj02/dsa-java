package com.guru.algorithms.searching;

public class BinarySearch {

    /*
        time complexity:
        best cast = O(1)
        avg case = O(log N) N - size of the array
        worst case = O()
     */

    public static void main(String[] args) {

        int[] arr = {-12, -8, -4, 0, 12, 23, 31, 42, 51, 68, 72, 83, 99, 100};
        int target = 121;

        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

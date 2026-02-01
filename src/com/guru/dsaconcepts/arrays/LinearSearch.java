package com.guru.dsaconcepts.arrays;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1, 23, 4, 5, 35, 66, 21, 67, 98, 12, 6};
        int target = 59;

        int ans = search(arr, target);

        System.out.println(ans);
    }

    public static int search(int[] arr, int target) {

        // if array is empty
        if(arr.length == 0) {
            return -1;
        }

        // actual search
        for(int index = 0; index < arr.length; index++) {

            if(arr[index] == target) {
                return index;
            }
        }

        // item not found
        return -1;
    }
}

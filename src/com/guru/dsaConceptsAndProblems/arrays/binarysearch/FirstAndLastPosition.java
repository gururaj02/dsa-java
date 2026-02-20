package com.guru.dsaConceptsAndProblems.arrays.binarysearch;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;

        System.out.println(Arrays.toString(search(nums, target)));
    }

    public static int[] search(int[] nums, int target) {

        int[] ans = {-1, -1};

//        int firstIndex = searchIndex(nums, target, true);
//        int secondIndex = searchIndex(nums, target, false);
//
//        ans[0] = firstIndex;
//        ans[1] = secondIndex;

        ans[0] = searchIndex(nums, target, true);
        if(ans[0] != -1) {
            ans[1] = searchIndex(nums, target, false);
        }

        return ans;
    }
    static int searchIndex(int[] nums, int target, boolean findFirstIndex) {

        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(target < nums[mid]) {
                end = mid - 1;
            }
            else if(target > nums[mid]) {
                start = mid + 1;
            }
            else {
                ans = mid;
                if(findFirstIndex) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

        }

        return ans;
    }




    // Brut force
    public static int[] searchBrut(int[] arr, int target) {
        int[] ans = new int[2];

        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] == target) {
                ans[0] = i;
                break;
            }
        }

        for(int j = arr.length - 1; j >= 0; j--) {
            if(arr[j] == target) {
                ans[1] = j;
                break;
            }
        }

        return ans;
    }


}

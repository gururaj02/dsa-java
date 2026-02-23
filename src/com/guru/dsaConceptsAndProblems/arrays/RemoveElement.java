package com.guru.dsaConceptsAndProblems.arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(Arrays.toString(nums));
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {

        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            } else {
                continue;
            }
        }

        return k;

    }
}
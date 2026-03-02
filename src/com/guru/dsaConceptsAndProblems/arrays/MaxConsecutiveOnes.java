package com.guru.dsaConceptsAndProblems.arrays;

class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};

        System.out.println(findMaxConsecutiveOnes1(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 1) {
                if(maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
            else {
                count++;
            }
        }

        return Math.max(maxCount, count);
    }

    // Simple and cleaner code
    public static int findMaxConsecutiveOnes1(int[] nums) {

        int count = 0;
        int maxCount = 0;

        for(int num : nums) {
            if(num == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else {
                count = 0;
            }
        }

        return maxCount;
    }
}
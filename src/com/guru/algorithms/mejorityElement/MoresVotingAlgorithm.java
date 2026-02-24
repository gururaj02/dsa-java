package com.guru.algorithms.mejorityElement;

import java.util.HashMap;
import java.util.Map;

public class MoresVotingAlgorithm {

    public static void main(String[] args) {

        int[] nums = {5,5,1,1,1,5,5};
        System.out.println(majorityElement(nums));

        // Using HasMap
        System.out.println(majorityElementUsingHasMap(nums));
    }

    // Moore's Voting Algorithm. Space Complexity is O(1)
    static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            if(count == 0) {
                candidate = nums[i];
            }

            if(nums[i] == candidate) {
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;
    }


    // Using HashMap Space complexity is O(n)
    static int majorityElementUsingHasMap(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int n = nums.length;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }
}

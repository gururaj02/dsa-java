package com.guru.dsaConceptsAndProblems.recursion.arrayquestions;

import java.util.ArrayList;

public class SearchInArray {

    public static void main(String[] args) {

        int[] arr = {3, 4, 1, 1, 9, 5, 6};
        int target = 1;

        System.out.println(find(arr, target, 0));

        System.out.println(findIndex(arr, target, 0));

        System.out.println(findIndexLast(arr, target, arr.length - 1));

        findAllIndex(arr, target, 0);
        System.out.println(list);

        System.out.println(findAllIndexAndReturnArrayList(arr, target, 0, new ArrayList<>()));

        System.out.println(findAllIndexAndReturnArrayList(arr, target, 0));
    }

    // Find target is present or not
    public static boolean find(int[] arr, int target, int index) {

        if(index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

    // Find and return the index of target
    public static int findIndex(int[] arr, int target, int index) {

        if(index == arr.length) {
            return -1;
        }

        if(arr[index] == target) {
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }
    }

    // Find index of the target from last
    public static int findIndexLast(int[] arr, int target, int index) {

        if(index == -1) {
            return -1;
        }

        if(arr[index] == target) {
            return index;
        }
        else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    // Find all indexes of target and add to list
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] arr, int target, int index) {

        if(index == arr.length) {
            return;
        }

        if(arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    // Find all indexes of target and return to list
    public static ArrayList<Integer> findAllIndexAndReturnArrayList(int[] arr, int target, int index, ArrayList<Integer> list) {

        if(index == arr.length) {
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }
        return findAllIndexAndReturnArrayList(arr, target, index + 1, list);
    }

    // Find all indexes of target and return to list without passing the argument
    public static ArrayList<Integer> findAllIndexAndReturnArrayList(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if(arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCall = findAllIndexAndReturnArrayList(arr, target, index + 1);

        list.addAll(ansFromBelowCall);

        return list;
    }
}

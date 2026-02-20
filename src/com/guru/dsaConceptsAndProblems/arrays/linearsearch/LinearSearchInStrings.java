package com.guru.dsaConceptsAndProblems.arrays.linearsearch;

import java.util.Arrays;

public class LinearSearchInStrings {
    public static void main(String[] args) {

        String name = "raj";
        char target = 'a';

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(search(name, target));
        System.out.println(search2(name, target));
    }

    public static int search(String str, char target) {

        if(str.length() == 0) {
            return -1;
        }

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                return i;
            }
        }

        return -1;

    }

    public static boolean search2(String str, char target) {

        if(str.length() == 0) {
            return false;
        }

        for(char ch : str.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }

        return false;

    }
}

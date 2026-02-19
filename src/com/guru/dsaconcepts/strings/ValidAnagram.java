package com.guru.dsaconcepts.strings;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "arc";
        String t = "car";

        System.out.println('a');

        char ch = 97;
        System.out.println(ch);

        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for(int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for(int ch : charCount) {
            if(ch != 0) {
                return false;
            }
        }

        return true;

    }

}
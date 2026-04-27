package com.guru.dsaConceptsAndProblems.recursion.strings;

import java.util.ArrayList;

public class PhonePad {

    public static void main(String[] args) {

        pad("", "12");

        System.out.println(padReturn("", "12"));
    }

    public static void pad(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0'; // this will convert '2' into 2 (50 - 48 = 2)
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            pad(processed + ch, unprocessed.substring(1));
        }

    }


    // returning list
    public static ArrayList<String> padReturn(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unprocessed.charAt(0) - '0'; // this will convert '2' into 2 (50 - 48 = 2)

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            list.addAll(padReturn(processed + ch, unprocessed.substring(1)));
        }

        return list;
    }
}

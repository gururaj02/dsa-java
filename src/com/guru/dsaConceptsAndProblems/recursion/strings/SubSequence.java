package com.guru.dsaConceptsAndProblems.recursion.strings;

import java.util.ArrayList;

public class SubSequence {

    public static void main(String[] args) {

        subSeq("", "abc");

        System.out.println(subSeqReturn("", "abc"));
    }

    public static void subSeq(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        subSeq(processed + ch, unprocessed.substring(1));
        subSeq(processed, unprocessed.substring(1));

    }

    public static ArrayList<String> subSeqReturn(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> left = subSeqReturn(processed + ch, unprocessed.substring(1));
        ArrayList<String> right = subSeqReturn(processed, unprocessed.substring(1));

        left.addAll(right);
        return left;
    }
}

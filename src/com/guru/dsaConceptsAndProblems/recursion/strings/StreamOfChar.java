package com.guru.dsaConceptsAndProblems.recursion.strings;

public class StreamOfChar {

    public static void main(String[] args) {

        skip("", "baccdah");

        System.out.println(skip("baccdah"));

        System.out.println(skipApple("bacapplecdah"));
    }

    public static void skip(String processed, String unprocessed) {

        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a') {
            skip(processed, unprocessed.substring(1));
        } else {
            skip(processed + ch, unprocessed.substring(1));
        }
    }

    // Another method
    public static String skip(String unprocessed) {

        if(unprocessed.isEmpty()) {
            return "";
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a') {
            return skip(unprocessed.substring(1));
        } else {
            return ch + skip(unprocessed.substring(1));
        }
    }


    // Skip a word
    public static String skipApple(String unprocessed) {

        if(unprocessed.isEmpty()) {
            return "";
        }

        if(unprocessed.startsWith("apple")) {
            return skipApple(unprocessed.substring(5));
        } else {
            return unprocessed.charAt(0) + skipApple(unprocessed.substring(1));
        }
    }
}

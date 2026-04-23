package com.guru.dsaConceptsAndProblems.recursion.strings;

public class Permutations {

    public static void main(String[] args) {
        permutations("", "abc");
    }

    public static void permutations(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            permutations(first + ch + second, up.substring(1));
        }
    }
}

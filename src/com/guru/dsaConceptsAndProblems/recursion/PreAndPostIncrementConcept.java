package com.guru.dsaConceptsAndProblems.recursion;

public class PreAndPostIncrementConcept {

    public static void main(String[] args) {
        int ans = fun(5);
        System.out.println(ans);
    }

    public static int fun(int num) {

        if(num == 0) {
            return 0;
        }

        System.out.println(num);

//        return fun(num--); // first it will pass 5 then decrement(4) again same thing repeats
        return fun(--num);
    }

    // If you don't want to print 0 then use this code
//    public static void fun(int num) {
//
//        if(num == 0) {
//            return;
//        }
//
//        System.out.println(num);
//        fun(--num);
//    }
}

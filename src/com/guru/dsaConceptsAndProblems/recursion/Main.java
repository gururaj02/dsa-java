package com.guru.dsaConceptsAndProblems.recursion;

public class Main {

    public static void main(String[] args) {

        message(0);
    }

    static void message(int count) {
        if(count == 5) {
            return;
        }

        System.out.println("Hello World");
        message(count + 1);
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        message();
//    }
//
//    static int count = 0;
//
//    static void message() {
//
//        if(count == 5) {
//            return;
//        }
//
//        count++;
//        System.out.println("Hello World");
//
//        message();
//    }
//}
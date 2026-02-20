package com.guru.dsaConceptsAndProblems.strings;

import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1); // it gets converted to int to Integer, that will call toString(). ("a" + "1")

        System.out.println("guru" + new ArrayList<>());

        System.out.println("guru" + new Integer(56));

        String ans = new ArrayList<>() + " " + new Integer(56);
        System.out.println(ans);
//        System.out.println(new ArrayList<>() + new Integer(56)); // this will give an error

        
    }
}

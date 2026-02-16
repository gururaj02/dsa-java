package com.guru.dsaconcepts.strings;

import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {

        String name = "Gururaj Naik Hello World";

        byte a = 127;
        short b = 32767;
        System.out.println(a);
        System.out.println(b);

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());

        System.out.println(name);

        System.out.println(Arrays.toString(name.getBytes()));

        System.out.println(name.indexOf('r'));

        System.out.println("     guru     ".strip());

        System.out.println(Arrays.toString(name.split(" ", 3)));
    }
}

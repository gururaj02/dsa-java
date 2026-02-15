package com.guru.dsaconcepts.strings;

public class Comparison {

    public static void main(String[] args) {

        // All these are created in String pool in heap memory. All are pointing to the same object
        String a = "guru";
        String b = "guru";
        String c = a;

        System.out.println(a == b); // true, because ref variables are pointing to the same object

        // These 2 are created outside the string pool, two different objects are created
        String name1 = new String("guru");
        String name2 = new String("guru");

        System.out.println(name1 == name2); // false, because ref variables are not pointing to the same object
        System.out.println(name1.equals(name2)); // true, because both values are same

//        Integer num = new Integer(5);
//        System.out.println(num.toString());
    }
}

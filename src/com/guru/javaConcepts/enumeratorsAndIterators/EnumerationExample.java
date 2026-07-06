package com.guru.javaConcepts.enumeratorsAndIterators;

import java.util.Enumeration;
import java.util.Vector;


/*

java 1.0
Limitation of Enumeration
- It can only Read Cannot Remove Replace Add
- It is Read Only.
- Works with Vectors, Stack, HashTable

*/

public class EnumerationExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        Enumeration<Integer> enumeration = vector.elements();

        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}

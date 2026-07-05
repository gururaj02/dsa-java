package com.guru.javaConcepts.shallowAndDeepCopy.usingCopyConstructor;

public class TestCopyConstructorDeepCopy {
    public static void main(String[] args) {
        Address address = new Address("Bengaluru");

        Student s1 = new Student(1, "Guru", address);

        Student s2 = new Student(s1);

        s2.address.city = "Mysore";

        System.out.println(s1.address.city);
        System.out.println(s2.address.city);
    }
}

package com.guru.javaConcepts.shallowAndDeepCopy.usingClonable.shallowCopy;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Bangalore");
        Student s1 = new Student(1, "Gururaj", addr);

        Student s2 = (Student) s1.clone();
        s2.address.city = "Bangalore";

        System.out.println(s1.address.city);
        System.out.println(s2.address.city);
    }
}

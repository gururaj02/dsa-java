package com.guru.javaConcepts.shallowAndDeepCopy.usingClonable.deepCopy;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Bangalore");
        Student s1 = new Student(1, "Gururaj", address);

        Student s2 = (Student)s1.clone();

        s2.address.city = "Mysore";

        System.out.println(s1.address.city); // Output: Bangalore
        System.out.println(s2.address.city); // Output: Mysore
    }
}

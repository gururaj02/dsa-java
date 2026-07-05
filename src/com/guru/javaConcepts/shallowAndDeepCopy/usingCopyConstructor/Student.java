package com.guru.javaConcepts.shallowAndDeepCopy.usingCopyConstructor;

public class Student {
    public int id;
    public String name;
    public Address address;

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.address = new Address(student.address); // Deep Copy
    }
}

package com.guru.javaConcepts.shallowAndDeepCopy.usingClonable.deepCopy;

public class Student implements Cloneable {
    public int id;
    public String name;
    public Address address;

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.address = new Address(this.address.city);  // New Address object for deep copy
        return student;
    }
}

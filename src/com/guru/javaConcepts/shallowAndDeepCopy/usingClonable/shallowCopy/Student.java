package com.guru.javaConcepts.shallowAndDeepCopy.usingClonable.shallowCopy;

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
        return super.clone();   // Shallow copy
    }
}

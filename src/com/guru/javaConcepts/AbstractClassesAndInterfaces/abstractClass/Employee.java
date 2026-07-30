package com.guru.javaConcepts.AbstractClassesAndInterfaces.abstractClass;

public abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
    public void company() {
        System.out.println("Google");
    }

    public abstract void calculateSalary();
}

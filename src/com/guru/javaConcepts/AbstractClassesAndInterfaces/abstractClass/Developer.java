package com.guru.javaConcepts.AbstractClassesAndInterfaces.abstractClass;

public class Developer extends Employee {
    Developer(String name) {
        super(name);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Developer Salary : 60,000");
    }
}

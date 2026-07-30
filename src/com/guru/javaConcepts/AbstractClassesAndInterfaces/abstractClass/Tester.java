package com.guru.javaConcepts.AbstractClassesAndInterfaces.abstractClass;

public class Tester extends Employee{
    Tester(String name) {
        super(name);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Tester Salary : 45,000");
    }
}

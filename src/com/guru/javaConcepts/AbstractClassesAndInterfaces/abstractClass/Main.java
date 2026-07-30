package com.guru.javaConcepts.AbstractClassesAndInterfaces.abstractClass;

public class Main {
    public static void main(String[] args) {
        Employee dev = new Developer("Guru");
        Employee tester = new Tester("Raj");

        dev.calculateSalary();
        tester.calculateSalary();

        System.out.println(dev.name);
        System.out.println(tester.name);
    }
}

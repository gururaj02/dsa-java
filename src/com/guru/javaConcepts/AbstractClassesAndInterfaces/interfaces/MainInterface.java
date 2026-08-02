package com.guru.javaConcepts.AbstractClassesAndInterfaces.interfaces;

public class MainInterface {
    public static void main(String[] args) {
        Test test = new Test();
        test.showDefault();
        test.defaultA();
        test.defaultB();

        test.greetAbstract();

        A.showStatic();
        B.showStatic();
    }
}

package com.guru.javaConcepts.AbstractClassesAndInterfaces.interfaces;

public class Test implements A, B {

    @Override
    public void showDefault() {
        B.super.showDefault();
    }

    @Override
    public void greetAbstract() {
        System.out.println("greetAbstract from Test from Interface A");
    }

    {
        A.showStatic();
    }
}

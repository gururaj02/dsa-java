package com.guru.javaConcepts.AbstractClassesAndInterfaces.interfaces;

public interface A {
    default void showDefault() {
        System.out.println("Default Method A");
    }

    default void defaultA() {
        System.out.println("Default function only in A");
    }

    static void showStatic() {
        System.out.println("Showing static A");
    }

    void greetAbstract();
}

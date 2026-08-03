package com.guru.javaConcepts.AbstractClassesAndInterfaces.interfaces;

/**
 * Java 8 -> static and default methods
 * Java 9 -> private methods
 */

public interface B {
    default void showDefault() {
        log();
        System.out.println("Default Method B");
    }

    default void defaultB() {
        log();
        System.out.println("Default function only in B");
    }

    static void showStatic() {
        System.out.println("Showing static A");
    }

    private void log() {
        System.out.println("Logging from B");
    }
}

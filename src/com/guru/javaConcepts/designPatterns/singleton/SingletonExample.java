package com.guru.javaConcepts.designPatterns.singleton;

public class SingletonExample {
    private static SingletonExample instance;

    private SingletonExample() {
        // private constructor to prevent instantiation
    }

    public static SingletonExample getInstance() {
        if (instance == null) { // Check 1: Free check.
            synchronized (SingletonExample.class) {
                // Threads only reach this slow, locked area ONCE at startup.

                if (instance == null) { // Check 2: The actual safe check.
                    instance = new SingletonExample();
                }
            }
        }
        // 99.9% of the time, threads jump straight here!
        return instance;
    }
}

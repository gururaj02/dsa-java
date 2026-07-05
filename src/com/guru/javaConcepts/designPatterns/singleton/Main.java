package com.guru.javaConcepts.designPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();

        System.out.println(singletonExample == singletonExample2);
    }
}

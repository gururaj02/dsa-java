package com.guru.javaConcepts.tightAndLooseCoupling;

interface Computer {
    public void compile();
}

class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiling using Desktop");
    }
}

class Laptop implements Computer{
    @Override
    public void compile() {
        System.out.println("Compiling using Laptop");
    }
}

class Developer {
    Computer computer;

    public void code(Computer computer) {
        System.out.println("Coding...");
        computer.compile();
    }
}

public class LooseCoupling {
    public static void main(String[] args) {

        Computer desktop = new Desktop();
        Computer laptop = new Laptop();

        Developer dev = new Developer();

        dev.code(laptop);
    }
}

package com.guru.javaConcepts.tightAndLooseCoupling;

class Laptop1 {
    public void compile() {
        System.out.println("Compiling using laptop...");
    }
}

class Desktop1 {
    public void compile() {
        System.out.println("Computing using desktop...");
    }
}

class Developer1 {
    Laptop1 laptop;

    public void code(Laptop1 laptop) {
        System.out.println("Coding...");
        laptop.compile();
    }
}

public class TightCoupling {
    public static void main(String[] args) {
        Laptop1 laptop = new Laptop1();
        Developer1 developer = new Developer1();

        developer.code(laptop);
    }
}

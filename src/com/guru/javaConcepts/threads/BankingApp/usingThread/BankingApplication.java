package com.guru.javaConcepts.threads.BankingApp.usingThread;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account, 300, "Guru");
        Customer c2 = new Customer(account, 500, "Raj");

        c1.start();
        c2.start();
    }
}

package com.guru.javaConcepts.threads.BankingApp.usingThread;

public class Customer extends Thread{
    BankAccount account;
    int amount;

    Customer(BankAccount account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

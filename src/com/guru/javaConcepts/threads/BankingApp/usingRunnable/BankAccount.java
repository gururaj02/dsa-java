package com.guru.javaConcepts.threads.BankingApp.usingRunnable;

public class BankAccount {
    private int balance = 0;

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            try {
                System.out.println(Thread.currentThread().getName() + " Waiting for balance to be available. Current balance: " + balance);
                wait(); // releases lock
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " completed withdrawal of " + amount + ". Remaining balance: " + balance);
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " completed deposit of " + amount + ". Remaining balance: " + balance);
        notify(); // notify waiting threads
    }
}

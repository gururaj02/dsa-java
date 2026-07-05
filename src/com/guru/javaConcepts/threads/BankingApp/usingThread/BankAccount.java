package com.guru.javaConcepts.threads.BankingApp.usingThread;

public class BankAccount {
    int balance = 500;

    public synchronized void withdraw(int amount) {

        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;

            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount + " but insufficient balance");
        }
    }
}

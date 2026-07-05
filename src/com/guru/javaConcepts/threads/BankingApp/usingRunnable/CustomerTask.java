package com.guru.javaConcepts.threads.BankingApp.usingRunnable;

public class CustomerTask implements Runnable{
    BankAccount account;
    int amount;

    public CustomerTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

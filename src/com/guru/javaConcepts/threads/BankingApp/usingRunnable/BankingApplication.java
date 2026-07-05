package com.guru.javaConcepts.threads.BankingApp.usingRunnable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        /**
         * To use CustomerTask, create Transaction type Enum and pass it to the CustomerTask constructor
         * and in CustomerTask run() method check the enum type, based on that call withdraw or deposit
        */
        // CustomerTask withdrawThread1 = new CustomerTask(account, 600);
        // CustomerTask depositThread1 = new CustomerTask(account, 700);

        Thread withdrawThread = new Thread(() -> {
            account.withdraw(600);
        }, "withdrawThread");

        Thread depositThread = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            account.deposit(1500);
        },  "depositThread");

        withdrawThread.start();
        depositThread.start();
    }
}

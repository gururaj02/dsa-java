package com.guru.javaConcepts.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class RunnableAndCallable {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println(10 + 20);
        };
        Thread thread1 = new Thread(task, "thread1");
        thread1.start();

        Callable<Integer> callableTask = () -> {
            return 10 + 20;
        };
        FutureTask<Integer> futureTask = new FutureTask<>(callableTask);
        Thread thread2 = new Thread(futureTask, "thread2");
        thread2.start();
        try {
            Integer result = futureTask.get();
            System.out.println("Result from callable task: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.guru.javaConcepts.threads.multiThreading;

import java.util.concurrent.*;

public class MultiThreadingExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor =
                Executors.newFixedThreadPool(1);

        Callable<Integer> task1 = () -> {
            Thread.sleep(2000);
            return 10;
        };

        Callable<Integer> task2 = () -> {
            Thread.sleep(1000);
            return 20;
        };

        Future<Integer> f1 = executor.submit(task1);
        Future<Integer> f2 = executor.submit(task2);

        System.out.println(f1.get());
        System.out.println(f2.get());

        executor.shutdown();
    }
}

package com.guru.javaConcepts.threads.creation;

class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Task is running in thread: " + Thread.currentThread().getName());
    }
}

public class ThreadExampleRunnable {
    public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        Thread thread = new Thread(task);
        thread.start();

        Thread.sleep(1000);

        System.out.println("Main thread is running in thread: " + Thread.currentThread().getName());
    }
}

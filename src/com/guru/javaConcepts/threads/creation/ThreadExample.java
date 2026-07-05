package com.guru.javaConcepts.threads.creation;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("I'm a thread");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

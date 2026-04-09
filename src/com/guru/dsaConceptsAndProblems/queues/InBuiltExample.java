package com.guru.dsaConceptsAndProblems.queues;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(18);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}

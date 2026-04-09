package com.guru.dsaConceptsAndProblems.stacks;

import java.util.Stack;

public class InBuiltExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(21);
        stack.push(1);
        stack.push(32);
        stack.push(41);
        stack.push(87);

        System.out.println(stack.pop());
    }
}

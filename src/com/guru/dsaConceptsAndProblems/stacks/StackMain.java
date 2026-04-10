package com.guru.dsaConceptsAndProblems.stacks;

public class StackMain {

    public static void main(String[] args) throws Exception {

        CustomStack stack = new CustomStack(5);

        System.out.println(stack.push(34));
        System.out.println(stack.push(45));
        System.out.println(stack.push(2));
        System.out.println(stack.push(9));
        System.out.println(stack.push(18));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());


        // TODO: Create a Custom Stack Exception

    }
}

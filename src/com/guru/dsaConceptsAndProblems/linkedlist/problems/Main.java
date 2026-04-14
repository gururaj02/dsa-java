package com.guru.dsaConceptsAndProblems.linkedlist.problems;

public class Main {

    public static void main(String[] args) {

        // Q-1
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.display();
//
//        list.insertRec(88, 3);
//        list.display();

        // Q-2
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);
        list.display();

        list.removeDuplicates();
        list.display();


    }
}

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
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.display();
//
//        list.removeDuplicates();
//        list.display();

        // Q-3
//        SinglyLinkedList first = new SinglyLinkedList();
//        first.insertLast(1);
//        first.insertLast(3);
//        first.insertLast(5);
//        first.display();
//
//        SinglyLinkedList second = new SinglyLinkedList();
//        second.insertLast(1);
//        second.insertLast(2);
//        second.insertLast(9);
//        second.insertLast(14);
//        second.display();
//
//        SinglyLinkedList ans = SinglyLinkedList.merge(first, second);
//        ans.display();

        // Q-4
        SinglyLinkedList list = new SinglyLinkedList();
        for(int i = 5; i > 0; i--) {
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();

    }
}

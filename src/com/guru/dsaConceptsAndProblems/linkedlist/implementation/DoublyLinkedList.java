package com.guru.dsaConceptsAndProblems.linkedlist.implementation;

public class DoublyLinkedList {

    private Node head;
    private int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;

        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;

        size++;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if(p == null) {
            System.out.println("Does not exists!");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null) {
            node.next.prev = node;
        }

        size++;
    }
    
    public int deleteFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        int val = head.value;

        // Case: only one element
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;

        return val;
    }

    public int deleteLast() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        // Case 1: Only one node
        if (head.next == null) {
            int val = head.value;
            head = null;
            return val;
        }

        // Case 2: More than one node
        Node node = head;

        while (node.next.next != null) {
            node = node.next;
        }

        int val = node.next.value;
        node.next.prev = null;
        node.next = null;

        size--;

        return val;
    }

    public int delete(int item) {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        Node node = head;

        // Find the node
        while (node != null && node.value != item) {
            node = node.next;
        }

        // Item not found
        if (node == null) {
            throw new RuntimeException("Item not found");
        }

        int val = node.value;

        // Case 1: Deleting head
        if (node == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return val;
        }

        // Case 2: Deleting last node
        if (node.next == null) {
            node.prev.next = null;
            return val;
        }

        // Case 3: Middle node
        node.prev.next = node.next;
        node.next.prev = node.prev;

        size--;

        return val;
    }

    // TODO: tyr to delete by index

    public Node find(int value) {
        Node node = head;

        while(node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        Node node = head;
        Node last = null;

        while(node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while(last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }


    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

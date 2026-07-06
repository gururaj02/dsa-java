package com.guru.javaConcepts.enumeratorsAndIterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*

java 1.2
-Iterator can only Read Remove
-Cannot Add Replace. For that we have ListIterator

*/

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {
            String s = iterator.next();

            if(s.equals("Apple")) {
                iterator.remove();
                // list.remove(s); // cannot do like this, it will give ConcurrentModificationException (Fail-Fast)
            }
            // System.out.println(iterator.next());
        }

        System.out.println(list);


        // Fail-Safe
        List<String> newList = new CopyOnWriteArrayList<>();
        newList.add("Cat");
        newList.add("Dog");
        newList.add("Horse");

        Iterator<String> itr = newList.iterator();
        while(itr.hasNext()) {
            String s = itr.next();
            if(s.equals("Horse")) {
                newList.remove(s);
            }
        }
        System.out.println(newList);
    }
}

package org.bootstrap.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPrgm {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        //insertion

        ll.add(10);
        ll.add(50);
        ll.add(40);
        ll.add(70);
        ll.add(90);
        ll.add(10);
        ll.add(30);
        ll.add(20);
        System.out.println(ll);

        //traversal method

        Iterator<Integer> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }

        //removing

        ll.remove(4);
        ll.remove(5);
        System.out.println(ll);

        //accesing the elemenet
        System.out.println("The elemenet in the index 2 is:"+ll.get(2));

        //remove all the elements from the linkedlist is clear()
        ll.clear();
        System.out.println(ll);
    }
}

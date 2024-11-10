package org.bootstrap.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPrgm {
    public static void main(String[] args) {
//        LinkedHashSet<Integer> lst = new LinkedHashSet<>();
        LinkedHashSet lst = new LinkedHashSet();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
        lst.addFirst(60);
        lst.addLast(90);
        System.out.println(lst);

        lst.removeFirst();
        lst.removeLast();
        System.out.println("After the manupultaion"+lst);

        lst.reversed();
        System.out.println("After getting reversed"+lst);

        Iterator itr = lst.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

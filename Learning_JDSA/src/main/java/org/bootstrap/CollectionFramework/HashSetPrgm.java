package org.bootstrap.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrgm {
    public static void main(String[] args) {
        HashSet hs = new HashSet(); //default capcity is 16 and load factor is 0.75
        hs.add(100);
        hs.add("abhi");
        hs.add(-200);
        hs.add("Nnjdj");
        hs.add(true);
        hs.add('a');
        System.out.println(hs);
        //remove()
        hs.remove("Nnjdj");
        System.out.println("After removing the element:"+hs);

        //contains()
        System.out.println(hs.contains("abhi"));
        System.out.println(hs.contains("Nnjdj"));

        System.out.println(hs.isEmpty());

        //traversal
        Iterator itr =  hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(Object e:hs){
            System.out.println("The values from th iterator"+ e);
        }

    }
}

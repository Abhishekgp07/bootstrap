package org.bootstrap.CollectionFramework;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(4);
        hs.add(6);
        System.out.println("HashSet"+hs);

        HashSet<Integer> nu = new HashSet<>();
        //add all by the other object
        nu.addAll(hs);
        nu.add(10);
        System.out.println("New HashSet"+ nu);
//remove all
        nu.removeAll(hs);
        System.out.println(nu);
    }
}

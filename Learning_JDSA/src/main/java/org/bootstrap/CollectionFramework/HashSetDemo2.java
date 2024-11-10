package org.bootstrap.CollectionFramework;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        //union Intersection difference
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        System.out.println("HashSet1"+hs);

        HashSet<Integer> nu = new HashSet<>();
        nu.add(3);
        nu.add(4);
        nu.add(5);
        System.out.println("HashSet2"+nu);

        //union
        hs.addAll(nu);
        System.out.println("Union"+hs);

        //intersection
        hs.retainAll(nu);
        System.out.println("Intersection"+hs);

        //differnece
        hs.removeAll(nu);
        System.out.println("Difference"+hs);
    }
}

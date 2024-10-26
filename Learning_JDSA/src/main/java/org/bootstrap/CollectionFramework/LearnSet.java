package org.bootstrap.CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args){
//        Set<Integer> set = new HashSet<>();

        Set<Integer> set = new TreeSet<>();



        set.add(40);
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(50);

        set.remove(30);
        System.out.println(set.contains(10));
        System.out.println(set);


    }

}

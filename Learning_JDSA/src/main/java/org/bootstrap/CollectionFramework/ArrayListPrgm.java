package org.bootstrap.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrgm {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();

        //Inserting elements in the Arraylist

        lst.add("Abhishek");
        lst.add("is ");
        lst.add("learning");
        lst.add("Java");
        lst.add("Collections");
        lst.add("Abhishek");
//        lst.add(2);
        System.out.println(lst);
//Accesing the arraylist objects

        System.out.println("The elemets availabke at 2nd index:"+lst.get(2));

        //seting the value and getting the value
        lst.set(2,"Manage");
        System.out.println(lst.get(2));

        System.out.println(lst);

        //removing the value
        lst.remove(2);
        lst.remove(4);
        System.out.println(lst);

        lst.set(1,"Learning");
        System.out.println(lst.contains("Abhishek"));

        //iterating the Arraylist
        Iterator itr = lst.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}

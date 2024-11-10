package org.bootstrap.CollectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class VectorPrgm {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        //insert
        v.add("Java");
        v.add("Collections");
        v.add("Framework");
        v.addElement("Hai");
        v.addElement("Abhishek");
        v.addElement("Good Noon");

        System.out.println(v);
        //Accessing the element
        System.out.println("Accessing the elements at location 3:"+v.elementAt(3));

        //removal
        v.remove(3);


        System.out.println(v);

        //traversal

        Iterator<String> itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

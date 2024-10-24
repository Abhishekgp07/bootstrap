package org.bootstrap.CollectionFramework;

import java.util.*;

public class ListLearn {
    public static void main(String[] args) {


        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        q.poll();
        q.peek();
while(q.isEmpty()){
    System.out.println(q.poll());
}

//        System.out.println(q.poll());
//        System.out.println(q.peek());
    }
}



















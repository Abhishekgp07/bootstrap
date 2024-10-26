package org.bootstrap.CollectionFramework;

import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offerFirst(20);
        dq.offerLast(30);

        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq.pollLast());
        System.out.println(dq);

        System.out.println(dq.peek());

    }
}

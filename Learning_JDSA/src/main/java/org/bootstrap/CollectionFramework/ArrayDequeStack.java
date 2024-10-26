package org.bootstrap.CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeStack {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        q.poll();
        System.out.println(q.poll());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack.poll());
    }

}

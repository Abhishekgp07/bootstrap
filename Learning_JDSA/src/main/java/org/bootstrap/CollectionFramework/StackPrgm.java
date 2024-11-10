package org.bootstrap.CollectionFramework;

import java.util.Stack;

public class StackPrgm {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        //insertion by the push
        stk.push(10);
        stk.push(33);
        stk.push(44);
        stk.push(66);
        stk.push(22);
        stk.push(10);
        System.out.println(stk);

        //remove
        stk.pop();
        stk.pop();
        System.out.println(stk);

        //searching
        System.out.println("searching element with value 66 inside the stack"+stk.search(66));

        //finding the top most element

        System.out.println("The element at the topmost position is:"+stk.peek());

        stk.clear();
        System.out.println(stk);
    }

}

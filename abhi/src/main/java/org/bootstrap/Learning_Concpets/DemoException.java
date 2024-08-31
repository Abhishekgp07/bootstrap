package org.bootstrap.Learning_Concepts;

import java.util.Scanner;

class Demo {
    void fun1() {
        System.out.println("Entered fun1");

        try {
            fun2();
        } catch (Exception e) {
            System.out.println("Exception handled in fun1");
            throw e;
        }
        System.out.println("This line will not execute if there is an exception");
    }

    void fun2() {
        System.out.println("Entered in fun2");
        try {
            int a, b, c;
            a = 10;
            b = 0;
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception handled in fun2");
            throw e;
        }
        System.out.println("This line will not execute if there is an exception");
    }
}

public class DemoException {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println("Entered the main");
        try {
            d1.fun1();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
        System.out.println("Program terminated normally");
    }
}

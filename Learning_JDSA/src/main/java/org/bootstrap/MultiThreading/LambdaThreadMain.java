package org.bootstrap.MultiThreading;

public class LambdaThreadMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("The thread is running maga"));
        t1.start();

    }
}

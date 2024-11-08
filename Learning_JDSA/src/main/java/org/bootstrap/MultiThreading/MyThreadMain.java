package org.bootstrap.MultiThreading;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("The thread is running buddy");
    }
}

public class MyThreadMain {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        my.start();
    }
}

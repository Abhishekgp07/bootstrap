package org.bootstrap.MultiThreading;

class MyRunnable implements Runnable{

    @Override
    public void run() {

    }
}

public class MyRunnableMain {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new MyThread();
        t1.start();
    }
}

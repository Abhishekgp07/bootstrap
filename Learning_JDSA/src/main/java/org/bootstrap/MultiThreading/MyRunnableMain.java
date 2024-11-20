package org.bootstrap.MultiThreading;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("The thread is running"+Thread.currentThread().getName());
    }
}

public class MyRunnableMain {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        t1.start();
        t1.run();
    }
}

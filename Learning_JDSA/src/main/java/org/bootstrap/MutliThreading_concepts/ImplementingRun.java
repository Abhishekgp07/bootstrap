package org.bootstrap.MutliThreading_concepts;

class TAsk1 implements Runnable {
    @Override
    public void run() {
        System.out.println("The task1 will get Executed");
    }
}

class TAsk2 implements Runnable {
    @Override
    public void run() {
        System.out.println("The task2 will get Executed");
    }
}

class TAsk3 implements Runnable {
    @Override
    public void run() {
        System.out.println("The task3 will get Executed");
    }
}

public class ImplementingRun {
    public static void main(String[] args) {
        TAsk1 t1 = new TAsk1();
        TAsk2 t2 = new TAsk2();
        TAsk3 t3 = new TAsk3();

        Thread th1 = new Thread(t1);  // Pass the Runnable to the Thread constructor
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);

        th1.start();  // Start the thread for task1
        th2.start();  // Start the thread for task2
        th3.start();  // Start the thread for task3
    }
}

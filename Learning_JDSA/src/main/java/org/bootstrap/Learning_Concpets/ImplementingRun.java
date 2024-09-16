package org.bootstrap.Learning_Concepts;

class task1 implements Runnable {
    @Override
    public void run() {
        System.out.println("The task1 will get Executed");
    }
}

class task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("The task2 will get Executed");
    }
}

class task3 implements Runnable {
    @Override
    public void run() {
        System.out.println("The task3 will get Executed");
    }
}

public class ImplementingRun {
    public static void main(String[] args) {
        task1 t1 = new task1();
        task2 t2 = new task2();
        task3 t3 = new task3();

        Thread th1 = new Thread(t1);  // Pass the Runnable to the Thread constructor
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);

        th1.start();  // Start the thread for task1
        th2.start();  // Start the thread for task2
        th3.start();  // Start the thread for task3
    }
}

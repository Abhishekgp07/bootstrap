package org.bootstrap.Learning_Concpets;

import java.util.Scanner;
class task1 implements Runnable{
    task1(){
        Thread th1 = new Thread(this);
        th1.start();
    }

    @Override
    public void run() {
        System.out.println("The task1 will get execueted");
    }
}
class task2 implements Runnable{
    task2(){
        Thread th2 = new Thread(this);
        th2.start();
    }

    @Override
    public void run() {
        System.out.println("The task2 will get Executed");
    }
}

class task3 implements Runnable{
    task3(){
        Thread th3 = new Thread(this);
        th3.start();
    }

    @Override
    public void run() {
        System.out.println("The taks3 will get Executed");
    }
}

public class ConstrutorRunnable {
    public static void main(String[] args) {
        task1 t1 = new task1();
        task2 t2 = new task2();
        task3 t3 = new task3();
    }
}

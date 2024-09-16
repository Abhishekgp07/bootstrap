package org.bootstrap.Learning_Concpets;

import java.util.Scanner;

class Task1 extends Thread{
    Task1(String name){
        super(name);
    }
    public void run(){
        System.out.println("Task1  will get executed");
    }
}
class Task2 extends Thread{
    Task2(String name){
        super(name);
    }
    public void run(){
        System.out.println("Task2 will  get executed");
    }
}
class Task3 extends Thread{
    Task3(){
        start();;
    }
    public void run(){
        System.out.println("Task3 will get executed");
    }
}

class NamingOfThreads{
    public static void main(String[] args) {
        Task1 t1= new Task1("Banking Thread");
        Task2 t2 = new Task2("Printing Thread");
        Task3 t3 = new Task3();
        t1.start();
        t2.start();
        t3.setName("Adding Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
        System.out.println(Thread.currentThread().getName());

    }
}
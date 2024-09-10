package org.bootstrap.Learning_Concpets;

import java.util.Scanner;
class task1 extends Thread{
    task1(String name){
        super(name);
    }
    public void run(){
        System.out.println("The task1 get executed");
    }
}
class task2 extends Thread{
    task2(String name){
        super(name);
    }
    public void run(){
        System.out.println("The task2 get executed");
    }
}
class task3 extends Thread{
    task3(){
        start();
    }
    public void run(){
        System.out.println("The task3 get executed");
    }
}
class NamingOfThreads{
    public static void main(String[] args) {
        task1 t1 = new task1("Banking");
        task2 t2 = new task2("Printing");
        task3 t3 = new task3();
        t1.start();
        t2.start();
        t3.setName("Adding");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
    }
}

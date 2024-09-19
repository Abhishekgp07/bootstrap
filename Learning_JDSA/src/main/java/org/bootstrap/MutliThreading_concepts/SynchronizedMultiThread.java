package org.bootstrap.MutliThreading_concepts;

import java.util.Scanner;
class BANK extends Thread{
    BANK(){
        Thread t1 = new Thread(this);
        Thread t2 = new Thread(this);
        Thread t3 = new Thread(this);
        t1.setName("Person1");
        t2.setName("Person2");
        t3.setName("Person3");
        t1.start();
        t2.start();
        t3.start();
    }
    synchronized public void run(){
        System.out.println(Thread.currentThread().getName()+"Has came to Bank");
        System.out.println(Thread.currentThread().getName()+"Had Given the passbook and took the challan for money withdraw");
        System.out.println(Thread.currentThread().getName()+"Has return the challan and took his Amount ");
        System.out.println(Thread.currentThread().getName()+"Had Went out of the bank");
    }
}

public class SynchronizedMultiThread {
    public static void main(String[] args) {

        BANK b= new BANK();
    }
}

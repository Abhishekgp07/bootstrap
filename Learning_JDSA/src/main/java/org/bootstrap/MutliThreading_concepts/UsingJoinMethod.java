package org.bootstrap.MutliThreading_concepts;
class Atm extends Thread{
    Atm(){
        Thread t1 = new Thread(this);
        Thread t2 = new Thread(this);
        Thread t3 = new Thread(this);
        t1.setName("Person1");
        t2.setName("Person2");
        t3.setName("Person3");
        try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"Has came to Bank");
        System.out.println(Thread.currentThread().getName()+"Had Given the passbook and took the challan for money withdraw");
        System.out.println(Thread.currentThread().getName()+"Has return the challan and took his Amount ");
        System.out.println(Thread.currentThread().getName()+"Had Went out of the bank");
    }
}
public class UsingJoinMethod {
    public static void main(String[] args) {
        Atm a = new Atm();
    }
}

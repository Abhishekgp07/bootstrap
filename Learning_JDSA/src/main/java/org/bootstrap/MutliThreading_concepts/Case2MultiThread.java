package org.bootstrap.MutliThreading_concepts;

class ATM implements Runnable{
    ATM() {
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
      public void run(){
        System.out.println(Thread.currentThread().getName()+"Has enter the ATM");
        System.out.println(Thread.currentThread().getName()+"Has inserted the ATM");
        System.out.println(Thread.currentThread().getName()+"Has inserted pin & withdrawing money");
        System.out.println(Thread.currentThread().getName()+"Has exited the ATM");
    }
}
public class Case2MultiThread {
    public static void main(String[] args) {
        ATM a = new ATM();
    }
}

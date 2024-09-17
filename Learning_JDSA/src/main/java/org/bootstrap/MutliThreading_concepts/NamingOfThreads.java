package org.bootstrap.MutliThreading_concepts;

 class TasK1 extends Thread{
    TasK1(String name){
        super(name);
    }
    public void run(){
        System.out.println("Task1  will get executed");
    }
}
class TasK2 extends Thread{
    TasK2(String name){
        super(name);
    }
    public void run(){
        System.out.println("Task2 will  get executed");
    }
}
class TasK3 extends Thread{
    TasK3(){
        start();;
    }
    public void run(){
        System.out.println("Task3 will get executed");
    }
}

class NamingOfThreads{
    public static void main(String[] args) {
        TasK1 t1= new TasK1("Banking Thread");
        TasK2 t2 = new TasK2("Printing Thread");
        TasK3 t3 = new TasK3();
        t1.start();
        t2.start();
        t3.setName("Adding Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
        System.out.println(Thread.currentThread().getName());

    }
}
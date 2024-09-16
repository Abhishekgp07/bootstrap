package org.bootstrap.Learning_Concepts;

import java.util.Scanner;

class Task1 extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username:");
        String name = sc.next();
        System.out.println("Enter the pin:");
        int pin = sc.nextInt();
        System.out.println("Login Successfully");
    }
}

class Task2 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Task3 extends Thread {
    public void run() {
        int a = 1000;
        int b = 2000;
        int c = a + b;
        System.out.println(c);
    }
}

public class EMultiThread {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        t1.start();
        t2.start();
        t3.start();
    }
}

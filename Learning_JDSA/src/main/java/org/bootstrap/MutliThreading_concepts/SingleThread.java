package org.bootstrap.MutliThreading_concepts;

import java.util.Scanner;
class Task {
    void banking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the user name:");
        String name = sc.next();
        System.out.println("enter the password:");
        int pin = sc.nextInt();
        System.out.println("Login successfully");
    }

    void print() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(50000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    void add() {
        int a = 1000;
        int b = 2000;
        int c = a + b;
        System.out.println(c);
    }
}
    class singleThread{
        public static void main(String[] args) {
            Task t = new Task();
            t.banking();
            t.print();
            t.add();
        }
    }



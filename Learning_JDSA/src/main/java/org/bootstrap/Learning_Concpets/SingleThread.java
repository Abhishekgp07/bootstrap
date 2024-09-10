package org.bootstrap.Learning_Concpets;

import java.util.Scanner;

class Task {
    void banking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username:");
        String name = sc.next();
        System.out.println("Enter the pin:");
        int pin = sc.nextInt();
        System.out.println("Login successful");
    }

    void print() {
        int i;
        try {
            for (i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(5000);
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

public class SingleThread {
    public static void main(String[] args) {
        Task t1 = new Task();
        t1.banking();
        t1.print();
        t1.add();
    }
}

package org.bootstrap.Learning_Concepts;

import java.util.Scanner;

class MSword extends Thread {
    public void run() {
        if (getName().equals("Typing")) {
            Typing();
        } else if (getName().equals("Checking")) {
            SpellCheck();
        } else {
            Autosave();
        }
    }

    void Typing() {
        try {
            for (int i = 0; i <= 20; i++) {
                System.out.println("Typing");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    void SpellCheck() {
        try {
            for (;;) {
                System.out.println("Checking spell");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    void Autosave() {
        try {
            for (;;) {
                System.out.println("Saving...");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class DemonThread {
    public static void main(String[] args) {
        MSword m1 = new MSword();
        MSword m2 = new MSword();
        MSword m3 = new MSword();

        m1.setName("Typing");
        m2.setName("Autosave");
        m2.setDaemon(true);
        m3.setName("Checking");
        m3.setDaemon(true);

        m1.start();
        m2.start();
        m3.start();


    }
}

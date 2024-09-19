package org.bootstrap.MutliThreading_concepts;

class Msword extends Thread {
    Msword(String name) {
        super(name);
    }

    public void run() {
        if (getName().equals("Typing")) {
            Typing();
        } else if (getName().equals("Checking")) {
            spellChecking();
        } else {
            Autosave();
        }
    }

    void Typing() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Typing");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    void spellChecking() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("The spelling  Checking");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    void Autosave() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Saving");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
    class MultiThreadingIndependent{
        public static void main(String[] args) {
            Msword m1 = new Msword("Typing");
            Msword m2 = new Msword("Chceking");
            Msword m3 = new Msword("Saving");
            m1.start();
            m2.start();
            m3.start();
        }
    }


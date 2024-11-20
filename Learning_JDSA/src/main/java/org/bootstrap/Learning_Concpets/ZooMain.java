package org.bootstrap.Learning_Concpets;

public class ZooMain {
    public static void main(String[] args) {
        Zoo lion = new Lion();
        Zoo tiger = new Tiger();

        lion.sleep();
        lion.eat();

        tiger.sleep();
        tiger.eat();
    }
}

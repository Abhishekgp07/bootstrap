package org.bootstrap.Learning_Concepts;

import java.util.Scanner;

abstract class Plane {
    abstract void takeoff();
    abstract void fly();
    abstract void land();
}

class Cargo extends Plane {
    @Override
    void takeoff() {
        System.out.println("Cargo took off");
    }

    @Override
    void fly() {
        System.out.println("Cargo is flying");
    }

    @Override
    void land() {
        System.out.println("Cargo has landed");
    }
}

class Fighter extends Plane {
    @Override
    void takeoff() {
        System.out.println("Fighter took off");
    }

    @Override
    void fly() {
        System.out.println("Fighter is flying");
    }

    @Override
    void land() {
        System.out.println("Fighter has landed");
    }
}

class Passenger extends Plane {
    @Override
    void takeoff() {
        System.out.println("Passenger took off");
    }

    @Override
    void fly() {
        System.out.println("Passenger is flying");
    }

    @Override
    void land() {
        System.out.println("Passenger has landed");
    }
}

class Airport {
    void allowPlane(Plane ref) {
        ref.takeoff();
        ref.fly();
        ref.land();
    }
}

public class AbstractConcepts {
    public static void main(String[] args) {
        Cargo cargo = new Cargo();
        Fighter fighter = new Fighter();
        Passenger passenger = new Passenger();

        Airport airport = new Airport();

        System.out.println("Testing Cargo:");
        airport.allowPlane(cargo);

        System.out.println("\nTesting Fighter:");
        airport.allowPlane(fighter);

        System.out.println("\nTesting Passenger:");
        airport.allowPlane(passenger);
    }
}

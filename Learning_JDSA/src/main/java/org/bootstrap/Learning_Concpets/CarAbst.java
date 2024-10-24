package org.bootstrap.Learning_Concpets;

abstract class vehicle {
    abstract void startEngine();

    void stopEngine() {
        System.out.println("The Vehicle is stopped due to some issues");
    }
}
    class bike extends vehicle {

        @Override
        void startEngine() {
            System.out.println("The Bike Engine Get started");
        }
    }

    class car extends vehicle{

        @Override
        void startEngine() {
            System.out.println("The car engine is started");
        }
    }



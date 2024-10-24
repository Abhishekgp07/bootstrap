package org.bootstrap.Learning_Concpets;

public class vehicleMain {
    public static void main(String[] args) {
        vehicle bike  = new bike();
        bike.stopEngine();
        bike.startEngine();

        vehicle car = new car();
        car.startEngine();
        car.stopEngine();


    }
}

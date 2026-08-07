package com.guru.javaConcepts.designPatterns.prototype;

public class Main {
    public static void main(String[] args) {
        // Fetch a pre-configured basic sedan clone
        Vehicle clientCar1 = VehicleRegistry.getVehicle("BASIC_SEDAN");
        // Customize the clone independently
        clientCar1.addFeature("Heated Seats");

        // Fetch another separate clone of the same basic sedan profile
        Vehicle clientCar2 = VehicleRegistry.getVehicle("BASIC_SEDAN");

        // Display results to prove independence
        System.out.print("Car 1 -> ");
        clientCar1.showDetails();

        System.out.print("Car 2 -> ");
        clientCar2.showDetails();
    }
}

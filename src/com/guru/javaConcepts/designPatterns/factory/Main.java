package com.guru.javaConcepts.designPatterns.factory;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("car");
        car.drive();

        Vehicle bike = VehicleFactory.createVehicle("bike");
        bike.drive();
    }
}

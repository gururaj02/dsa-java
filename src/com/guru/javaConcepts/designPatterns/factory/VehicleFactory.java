package com.guru.javaConcepts.designPatterns.factory;

public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        if (type.equals("car")) {
            return new Car();
        }
        if (type.equals("bike")) {
            return new Bike();
        }
        return null;
    }
}

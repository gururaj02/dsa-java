package com.guru.javaConcepts.designPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private static Map<String, Vehicle> registry = new HashMap<>();

    static {
        // Simulating heavy configuration setups
        Car basicSedan = new Car("Sedan Basic", "1.5L");
        basicSedan.addFeature("Air Conditioning");
        basicSedan.addFeature("Power Steering");
        registry.put("BASIC_SEDAN", basicSedan);

        Car sportsSUV = new Car("SUV Sports", "3.0L Turbo");
        sportsSUV.addFeature("4WD");
        sportsSUV.addFeature("Sunroof");
        sportsSUV.addFeature("Leather Seats");
        registry.put("SPORTS_SUV", sportsSUV);
    }

    public static Vehicle getVehicle(String type) {
        Vehicle prototype = registry.get(type);
        return (prototype != null) ? prototype.clone() : null; // Returns a clone
    }
}

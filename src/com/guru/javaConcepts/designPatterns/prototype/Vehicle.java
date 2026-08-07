package com.guru.javaConcepts.designPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable {
    private String model;
    private String engine;
    private List<String> features;

    public Vehicle(String model, String engine) {
        this.model = model;
        this.engine = engine;
        this.features = new ArrayList<>();
    }

    public void addFeature(String feature) {
        this.features.add(feature);
    }

    public List<String> getFeatures() {
        return features;
    }

    public void showDetails() {
        System.out.println("Model :" + model + " | Engine :" + engine + " | Features :" + features);
    }

    @Override
    public Vehicle clone() {
        try {
            Vehicle cloned = (Vehicle) super.clone();
            // Deep copy mutable fields to avoid shared references
            cloned.features = new ArrayList<>(features);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed" + e);
        }
    }

}

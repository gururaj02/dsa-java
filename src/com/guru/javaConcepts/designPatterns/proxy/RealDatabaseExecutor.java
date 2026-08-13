package com.guru.javaConcepts.designPatterns.proxy;

public class RealDatabaseExecutor implements DatabaseExecutor {
    @Override
    public String executeQuery(String sqlQuery) {
        // Simulating an expensive network round-trip to a physical database
        System.out.println("Connecting to the physical Database... Executing: " + sqlQuery);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Result Set Data for [" + sqlQuery + "]";
    }
}

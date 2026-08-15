package com.guru.javaConcepts.designPatterns.proxy;

public class ApplicationProxy {
    public static void main(String[] args) {
        // Client interacts with the service seamlessly through the interface
        DatabaseExecutor db = new CachingDatabaseProxy();

        // First Query execution (Cache Miss - Slow performance)
        System.out.println(db.executeQuery("SELECT * FROM products WHERE category = 'electronics'"));
        System.out.println("---------------------------------------------------");

        // Second Query execution (Cache Hit - Instantaneous performance)
        System.out.println(db.executeQuery("SELECT * FROM products WHERE category = 'electronics'"));
    }
}

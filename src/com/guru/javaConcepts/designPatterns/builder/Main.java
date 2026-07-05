package com.guru.javaConcepts.designPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee.Builder()
                .setName("Guru")
                .setAge(30)
                .setCity("Bengaluru")
                .setPhone("123-456-7890")
                .setEmail("guru@example.com")
                .setSalary(50000.0)
                .build();

        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getCity());
        System.out.println(employee.getPhone());
        System.out.println(employee.getEmail());
        System.out.println(employee.getSalary());
    }
}

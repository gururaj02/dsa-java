package com.guru.javaConcepts.designPatterns.builder;

public class Employee {
    // Private variables prevent direct outside modification
    private final String name;
    private final int age;
    private final String city;
    private final String phone;
    private final String email;
    private final double salary;

    public Employee(String name, int age, String city, String phone, String email, double salary) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public static class Builder {
        private String name;
        private int age;
        private String city;
        private String phone;
        private String email;
        private double salary;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(name, age, city, phone, email, salary);
        }
    }
}

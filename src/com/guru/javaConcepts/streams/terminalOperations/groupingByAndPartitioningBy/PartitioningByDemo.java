package com.guru.javaConcepts.streams.terminalOperations.groupingByAndPartitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByDemo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 30000),
                new Employee("Bob", "IT", 40000),
                new Employee("David", "HR", 50000),
                new Employee("Charlie", "Finance", 35000)
        );

        // Partition Employees based on salary greater than 35000
        Map<Boolean, List<Employee>> partitionedBySalary =
                employees.stream()
                        .collect(Collectors.partitioningBy(employee -> employee.getSalary() > 35000));

        // Print the partitioned Employees
        System.out.println("Employees with salary > 35000 : ");
        partitionedBySalary.get(true).forEach(System.out::println);

        System.out.println("Employees with salary <= 35000 : ");
        partitionedBySalary.get(false).forEach(System.out::println);
    }
}

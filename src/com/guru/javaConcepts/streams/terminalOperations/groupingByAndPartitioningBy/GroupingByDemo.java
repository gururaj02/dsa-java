package com.guru.javaConcepts.streams.terminalOperations.groupingByAndPartitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 30000),
                new Employee("Bob", "IT", 40000),
                new Employee("David", "HR", 50000),
                new Employee("Charlie", "Finance", 35000)
        );

        // Group Employees by department
        Map<String, List<Employee>> employeesByDepartment =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        // Print the grouped Employees
        employeesByDepartment.forEach((department, employeeList) -> {
            System.out.println("Department: " + department);
            employeeList.forEach(System.out::println);
        });
    }
}

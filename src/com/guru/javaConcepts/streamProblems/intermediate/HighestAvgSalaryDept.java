package com.guru.javaConcepts.streamProblems.intermediate;

import com.guru.javaConcepts.streamProblems.intermediate.dto.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestAvgSalaryDept {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "John", "IT", 60000),
                new Employee(2, "Jane", "HR", 55000),
                new Employee(3, "Mike", "IT", 70000),
                new Employee(4, "Sara", "HR", 65000),
                new Employee(5, "David", "Finance", 60000),
                new Employee(6, "Emma", "IT", 70000),
                new Employee(7, "Chris", "Finance", 75000),
                new Employee(8, "Jack", "Operations", 85000)
        );

        Map.Entry<String, Double> stringDoubleEntry = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(stringDoubleEntry);
        System.out.println("Department with highest average salary: " + stringDoubleEntry.getKey() + ", Average Salary: " + stringDoubleEntry.getValue());
    }
}

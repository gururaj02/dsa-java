package com.guru.javaConcepts.streamProblems.intermediate;

import com.guru.javaConcepts.streamProblems.intermediate.dto.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesBySalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", "HR",50000),
                new Employee(102, "Alice", "IT", 70000),
                new Employee(103, "Bob", "Finance", 45000),
                new Employee(104, "David", "IT", 90000)
        );

        List<Employee> listAscending = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();

        System.out.println("Employees sorted by salary: " + listAscending);

        List<Employee> listDescending = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();

        System.out.println("Employees sorted by salary: " + listDescending);
    }
}

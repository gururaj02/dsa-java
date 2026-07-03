package com.guru.javaConcepts.streamProblems.intermediate;

import com.guru.javaConcepts.streamProblems.intermediate.dto.Employee;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HighestPaidByDept {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", "HR",50000),
                new Employee(102, "Jane", "IT",70000),
                new Employee(102, "Mike", "IT", 80000),
                new Employee(103, "Sara", "Finance", 60000),
                new Employee(104, "Paul", "HR", 55000)
        );

        Map<String, Optional<Employee>> collect = employees.stream()
                .collect((Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))
                ));

        System.out.println(collect);
    }
}

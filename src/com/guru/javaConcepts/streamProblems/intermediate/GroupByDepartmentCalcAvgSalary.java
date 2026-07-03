package com.guru.javaConcepts.streamProblems.intermediate;

import com.guru.javaConcepts.streamProblems.intermediate.dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartmentCalcAvgSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "HR",50000),
                new Employee(2, "Jane", "IT",70000),
                new Employee(2, "Mike", "IT", 80000),
                new Employee(3, "Sara", "Finance", 60000),
                new Employee(4, "Paul", "HR", 55000)
        );

        // group employees by department and calculate avg salary
        Map<String, Double> output = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average salary by department: " + output);
    }
}

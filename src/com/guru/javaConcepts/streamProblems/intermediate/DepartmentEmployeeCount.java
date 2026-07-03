package com.guru.javaConcepts.streamProblems.intermediate;

import com.guru.javaConcepts.streamProblems.intermediate.dto.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentEmployeeCount {
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

        Map<String, Long> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(map);


        /*

        map.entrySet() = [
            ("IT" -> 3),
            ("HR" -> 3),
            ("Finance" -> 2)
        ]
        it will give like this, then we are apply stream on this

        */
        List<String> list = map.entrySet().stream()
                .filter(entry -> entry.getValue() > 2)
                .map(entry -> entry.getKey())
                .toList();

        System.out.println("Department having more than 2 employees : " + list);


        // Combining both operations
        List<String> employeeCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 2)
                .map(entry -> entry.getKey())
                .toList();

        System.out.println("Department having more than 2 employees : " + employeeCount);
    }
}

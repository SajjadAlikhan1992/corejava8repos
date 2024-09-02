package com.example.collectorsoperations;

import com.example.entites.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class toMapMethodClientApplication {
    public static void main(String[] args) {

        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Sajjad", 206000.00));
        employees.add(new Employee(1, "Sajjad", 206000.00));
        employees.add(new Employee(3, "Sadakhat", 206000.00));
        employees.add(new Employee(4, "Hayatulla", 206000.00));

        Map<Integer, String> stringMap = employees.stream().collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpName));
        System.out.println(stringMap);
    }
}

package com.example.collectorsoperations;

import com.example.entites.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SummingDoubleClientApp {
    public static void main(String[] args) {

        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Sajjad", 206000.00));
        employees.add(new Employee(1, "Sajjad", 206000.00));
        employees.add(new Employee(3, "Sadakhat", 206000.00));
        employees.add(new Employee(4, "Hayatulla", 206000.00));

        Double sumOfAllSalaries = employees
                .stream()
                .collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Sum of all Salaries =" + sumOfAllSalaries);

        double result=employees.stream().collect(Collectors.summingDouble(employee-> employee.getSalary()));
        System.out.println(result);
    }
}

package com.example.collectorsoperations;

import com.example.entites.Cities;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinByOPerationClientApp {
    public static void main(String[] args) {

        Cities city1 = new Cities("Bangalore", 8443675L);
        Cities city2 = new Cities("Bangalore", 8443675L);
        Cities city3 = new Cities("Hyderabad", 6993262L);
        Cities city4 = new Cities("Mumbai", 12442373L);

        List<Cities> citiesList = new LinkedList<>();
        citiesList.add(city1);
        citiesList.add(city2);
        citiesList.add(city3);
        citiesList.add(city4);

        //find the min population
        Optional<Cities> minPopulationIs = citiesList.stream().collect(Collectors.minBy(Comparator.comparing(cities -> cities.getPopulation())));
        if (minPopulationIs.isPresent()) {
            System.out.println("min population is --" + minPopulationIs.get());
        }
        System.out.println("Max population is --" + citiesList.stream().max(Comparator.comparing(employee -> employee.getPopulation())));


    }
}

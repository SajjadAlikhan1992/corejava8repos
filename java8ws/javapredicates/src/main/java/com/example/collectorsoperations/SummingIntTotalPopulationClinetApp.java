package com.example.collectorsoperations;

import com.example.entites.Cities;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SummingIntTotalPopulationClinetApp {
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

        Long totalPoplationInMetroCities = citiesList.stream().collect(Collectors.summingLong(Cities::getPopulation));
        System.out.println("Total Population in Metro cities are -- " + totalPoplationInMetroCities);
        Long totPop
                = citiesList.stream().collect(Collectors.summingLong(cities -> cities.getPopulation()));

        System.out.println("Total Population is -- " + totPop);
    }
}

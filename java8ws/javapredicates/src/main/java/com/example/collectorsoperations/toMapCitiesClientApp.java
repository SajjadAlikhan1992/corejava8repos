package com.example.collectorsoperations;

import com.example.entites.Cities;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class toMapCitiesClientApp {
    public static void main(String[] args) {
        List<Cities> citiees = new LinkedList<>();
        citiees.add(new Cities("Bangalore", 3200000));
        citiees.add(new Cities("Hyderabad", 3200000));
        citiees.add(new Cities("Vizag", 3200000));

        Map<String, Long> map = citiees.stream().collect(Collectors.toMap(Cities::getCityName, Cities::getPopulation));
        System.out.println(map);
    }
}

package com.example.collectorsoperations;

import com.example.entites.Cities;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MappingCitiesToTheirPopulation {
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
        //Map<String, Long> s = citiesList.stream().collect(Collectors.toMap(Cities::getCityName, Cities::getPopulation));
        Map<String, Long> stringLongMap = citiesList.stream().collect(Collectors.toMap(city -> city.getCityName(), city -> city.getPopulation(), (count1, count2) -> count1 + count2));
        //System.out.println(s);
        System.out.println(stringLongMap);

    }
}

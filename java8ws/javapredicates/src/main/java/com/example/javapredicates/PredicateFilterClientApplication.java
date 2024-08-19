package com.example.javapredicates;

import java.util.Arrays;
import java.util.List;

public class PredicateFilterClientApplication {
    public static void main(String[] args) {
        //let say you have elements 1,2,3,4,5,6,7,8,9,10
        // i want to filter the elements , i.e only even elements
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        PredicateFiltering pf = new PredicateFiltering();
        List<Integer> filteredOnlyEvenItems = pf.filterOnlyEvenItems(integerList);
        System.out.println(filteredOnlyEvenItems);
    }

}

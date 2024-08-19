package com.example.javapredicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFiltering {


    public List<Integer> filterOnlyEvenItems(List<Integer> stringList) {
        return stringList.stream().filter(loadEvenValues()).collect(Collectors.toList());
    }

    private static Predicate<Integer> loadEvenValues() {
        return value -> value % 2 == 0;
    }
}

package com.example.collectorsoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingIntClientApp {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfALl = numbers.stream().collect(Collectors.summingInt(number -> number));
        System.out.println(sumOfALl);
        
    }
}

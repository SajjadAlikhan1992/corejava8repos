package com.example.collectorsoperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheNumberFrquencyClientApp {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4);
        Map<Integer, Integer> numbersAndCounts = numbers.stream().collect(Collectors.toMap(number -> number, number -> 1, (num1, num2) -> num1 + num2));
        System.out.println("The Given Numbers and its Count");
        System.out.println(numbersAndCounts);
        //find the number elements in a stream
        long number = numbers.stream().collect(Collectors.counting());
        System.out.println("Number of elements in a stream is --" + number);
    }
}

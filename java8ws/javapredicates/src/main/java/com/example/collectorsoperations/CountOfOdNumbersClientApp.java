package com.example.collectorsoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountOfOdNumbersClientApp {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Long oddNumbers = numbers
                .stream()
                .filter(number -> number % 2 != 0)
                .collect(Collectors.counting());

        System.out.println("Total Odd Numbers are -- " + oddNumbers);

    }

}

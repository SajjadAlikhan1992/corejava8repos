package com.example.collectorsoperations;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountTheEvenNumberInListClientApp {
    public static void main(String[] args) {

        Long result = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().filter(number -> number % 2 == 0).collect(Collectors.counting());
        System.out.println("count of even numbers are --" + result);

    }
}

package com.example.javapredicates;

import java.util.function.IntPredicate;

public class PredicateAgeCheck {

    public static void main(String[] args) {

        IntPredicate integerPredicate = (age) -> age > 19;
        boolean result = integerPredicate.test(20);
        if (result) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}

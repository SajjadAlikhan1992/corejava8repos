package com.example.javapredicates;

import java.util.function.IntPredicate;

public class PredicateCheckPensionEligibility {
    public static void main(String[] args) {
        IntPredicate intPredicate = (age) -> age > 60;
        boolean result = intPredicate.test(65);
        if (result) {
            System.out.println("Eligible for Pension");
        } else {
            System.out.println("Not Eligible For Pension");
        }
    }
}

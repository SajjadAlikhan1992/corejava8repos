package com.example.javapredicates;

import java.util.function.IntPredicate;

public class PredicateCheckVoterEligibility {
    public static void main(String[] args) {

        int minumumAge = 19;
        IntPredicate intPredicate = (age) -> age > minumumAge;
        boolean result = intPredicate.test(25);
        if (result) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote ");
        }
    }
}

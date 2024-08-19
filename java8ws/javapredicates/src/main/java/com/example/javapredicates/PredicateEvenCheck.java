package com.example.javapredicates;

import java.util.function.IntPredicate;

public class PredicateEvenCheck {
    public static void main(String[] args) {

        System.out.println("Checking Predicate is Even or Odd");
        IntPredicate intPredicate = (value) -> value % 2 == 0;
        intPredicate.test(10);
    }
}

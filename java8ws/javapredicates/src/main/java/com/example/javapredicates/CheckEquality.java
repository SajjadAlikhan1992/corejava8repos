package com.example.javapredicates;

import java.util.function.BiPredicate;

public class CheckEquality {
    public static void main(String[] args) {
        String existingString = "Hello";
        CharSequence currentCharSeq = "hello";
        ContentEquals contentEquals = new ContentEquals();
        boolean testResult = contentEquals.test_content_equality(existingString,currentCharSeq);


    }

}

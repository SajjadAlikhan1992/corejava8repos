package com.example.collectorsoperations;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountingNumberOfWords {
    public static void main(String[] args) {

        String sentence = "Hello Java Developer";
        Long totalWords = Arrays.stream(sentence.split(" ")).collect(Collectors.counting());
        System.out.println("totalWords are -- " + totalWords);

    }
}

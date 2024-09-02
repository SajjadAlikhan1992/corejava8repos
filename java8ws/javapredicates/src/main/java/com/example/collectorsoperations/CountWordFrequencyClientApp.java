package com.example.collectorsoperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordFrequencyClientApp {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "apple", "guava");
        /*Map<String, Integer> wordFrequency
                = words.stream().collect(Collectors.toMap(Function.identity(), word -> 1, Integer::sum));
        System.out.println(wordFrequency);*/

        Map<String, Integer> wordsFre = words.stream().collect(Collectors.toMap(word -> word, word -> 1, (count1, count2) -> count1 + count2));
        System.out.println(wordsFre);

    }
}

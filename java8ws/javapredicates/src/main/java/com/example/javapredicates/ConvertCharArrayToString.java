package com.example.javapredicates;

public class ConvertCharArrayToString {
    public static void main(String[] args) {
        char[] data = {'H', 'E', 'L', 'L', 'O'};
        String chrDataString = String.copyValueOf(data);
        System.out.println(chrDataString);
    }
}

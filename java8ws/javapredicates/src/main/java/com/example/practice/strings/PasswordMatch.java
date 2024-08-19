package com.example.practice.strings;

public class PasswordMatch {
    public static void main(String[] args) {

        String password = "Sajjad1234";
        StringBuffer confirmPassword = new StringBuffer("Sajjad1234");

        if (password.contentEquals(confirmPassword)) {
            System.out.println("Pasword Matched ");
        } else {
            System.out.println("Password are not matched");
        }
    }
}   

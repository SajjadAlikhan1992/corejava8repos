package com.example.practice.strings;

public class PasswordEqualityCheck {
    public static void main(String[] args) {

        String storedPassword = "1234Sajjad";
        StringBuffer enterdPassword = new StringBuffer("1234Sajjad");
        if (storedPassword.contentEquals(enterdPassword)) {
            System.out.println("Passwords are Equal");
        } else {
            System.out.println("Passnot Equal");
        }


    }
}

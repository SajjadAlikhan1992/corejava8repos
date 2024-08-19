package com.example.practice.strings;

public class ContentEqualsUsingStringBuffer {
    public static void main(String[] args) {

        String string = "Welcome Back Developer";
        StringBuffer stringBuffer = new StringBuffer("Welcome Back Developer");

        if (string.contentEquals(stringBuffer)) {
            System.out.println("Contents are Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}

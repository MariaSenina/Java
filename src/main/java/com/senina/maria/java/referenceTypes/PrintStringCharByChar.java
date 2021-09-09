package com.senina.maria.java.referenceTypes;

public class PrintStringCharByChar {

    public static void main(String[] args) {
        String newString = "This is a lot of text again";

        for(int i = 0; i < newString.length(); i++) {
            System.out.println(newString.charAt(i));
        }
    }
}

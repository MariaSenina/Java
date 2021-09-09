package com.senina.maria.java.referenceTypes;

import java.sql.SQLOutput;

public class BasicStringMethods {

    public static void main(String[] args) {
        String str = "Test";

        //print the length of str
        System.out.println(str.length());

        //print a character in a specific place (starts at 0)
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));

        String biggerString = "This is a lot of text";

        //substrings
        System.out.println(biggerString.substring(5));
        System.out.println(biggerString.substring(5, 13));


    }
}

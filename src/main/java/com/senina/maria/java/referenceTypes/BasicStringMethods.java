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

        //use indexOf() to get the index of the first character of the desired String
        System.out.println(biggerString.indexOf("lot"));

        //lastIndexOf() returns the index of the last occurrence of a letter
        System.out.println(biggerString.lastIndexOf('t'));

        //search for a word with contains() - returns a boolean value
        System.out.println(biggerString.contains("text"));

        //check if a String starts with a particular substring by using startsWith() - returns a boolean value
        System.out.println(biggerString.startsWith("It"));

        //check if a String ends with a specific substring by using endsWith()
        System.out.println(biggerString.endsWith("xt"));

        //check if a String is empty with isEmpty()
        System.out.println(biggerString.isEmpty());

        //check if a String equals to another String
        System.out.println(biggerString.equals("This is a lot of text")); //case-sensitive
        System.out.println(biggerString.equalsIgnoreCase("This is a LOT of text")); //ignores case

    }
}

package com.senina.maria.java.collections.map.exercise;

import java.util.*;

public class ExerciseTest {
    public static void main(String[] args) {
        String string = "This is an awesome occasion. " + "This has never happened before.";

        System.out.println(countCharacterOccurrence(string));

        System.out.println(countWordOccurrence(string));
    }
    //How many times does each character occur in a given string?
    public static Map countCharacterOccurrence(String string) {
        Map<Character, Integer> occurrence = new HashMap<>();
        string = string.replace(" ", "");
        string = string.replace(".", "");

        //put string into an array of chars
        char[] characters = string.toLowerCase().toCharArray();

        //iterate over the array
        for (char character : characters) {
            Integer count = occurrence.get(character);
            if (count == null) {
                //initialize count for it at 1
                occurrence.put(character, 1);
            } else {
                //if it's there - increment
                occurrence.put(character, count + 1);
            }
        }
        return occurrence;
    }

    //How many times each word occurs in a given string?
    public static Map countWordOccurrence(String string) {
        Map<String, Integer> occurrence = new HashMap<>();
        string = string.replace(".", "");
        String[] words = string.toLowerCase().split(" ");

        for (String word : words) {
            Integer count = occurrence.get(word);
            if (count == null) {
                occurrence.put(word, 1);
            } else {
                occurrence.put(word, count + 1);
            }
        }

        return occurrence;
    }
}

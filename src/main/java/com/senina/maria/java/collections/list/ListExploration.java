package com.senina.maria.java.collections.list;

import java.util.List;

public class ListExploration {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Bat", "Cat");

        System.out.println("Words: " + words);

        System.out.println("Size: " + words.size());

        System.out.println("Empty: " + words.isEmpty());

        System.out.println("Element at 0: " + words.get(0));

        System.out.println("Contains 'Dog': " + words.contains("Dog"));
    }
}

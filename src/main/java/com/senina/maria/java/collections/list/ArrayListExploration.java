package com.senina.maria.java.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExploration {
    public static void main(String[] args) {
        //Note: the built-in methods used here can be used when working with LinkedList and Vector

        List<String> words = new ArrayList<>();

        words.add("Apple");
        words.add("Bat");
        words.add("Cat");
        words.add("Dog");
        System.out.println("Initial ArrayList words: " + words);

        words.add(2, "Ball");
        System.out.println("words mod1: " + words);

        //ArrayList allows for duplicate values
        words.add("Ball");
        System.out.println("words mod2: " + words);

        List<String> newList = List.of("Yak", "Zebra");

        words.addAll(newList);
        System.out.println("words mod3: " + words);

        words.set(5, "Fish");
        System.out.println("words mod4: " + words);

        words.remove(0);
        System.out.println("words mod5: " + words);

        words.remove("Dog"); //the fist instance of "Dog" will be removed
        System.out.println("words mod6: " + words);
    }
}

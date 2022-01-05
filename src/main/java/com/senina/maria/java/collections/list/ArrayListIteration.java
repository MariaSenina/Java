package com.senina.maria.java.collections.list;

import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Bat", "Cat");

        //simple 'for' loop
        System.out.println("Simple 'for':");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

        System.out.println();

        //enhanced 'for' loop
        System.out.println("Enhanced 'for':");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println();

        //Iterator (requires the use of 'while')
        System.out.println("'while' with Iterator:");
        Iterator wordsIterator = words.iterator();
        while (wordsIterator.hasNext()) {
            System.out.println(wordsIterator.next());
        }
    }
}

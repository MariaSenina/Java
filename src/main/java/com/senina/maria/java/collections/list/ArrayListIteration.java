package com.senina.maria.java.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Bat", "Cat");
        List<String> wordsArrayList = new ArrayList<>(words);

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
        System.out.println();

        //Print all the words that end with "at"
        System.out.println("Words ending with \"at\":");
        for (String word : words) {
            if (word.endsWith("at")) {
                System.out.println(word);
            }
        }
        System.out.println();

        //Remove all the words that end with "at". Iterator recommended!
        System.out.println("Remove words ending with \"at\":");
        Iterator<String> iterator = wordsArrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().endsWith("at")) {
                iterator.remove();
            }
        }
        System.out.println(wordsArrayList);
        //Fun fact: Enhanced 'for' doesn't allow for removal of the elements in the middle of the List, as it may lead to changes
        //          in how the iteration occurs.
    }
}

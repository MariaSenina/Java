package com.senina.maria.java.javaTips.anonymousClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassTest {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(List.of("Cat", "Mouse", "Elephant", "Parrot"));
        System.out.println(animals);

        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return Integer.compare(str1.length(), str2.length());
            }
        });
    }
    //An anonymous class does not have a name
    // -> Usually used when we don't need to reuse an instance fo this class anywhere else in the code
    //    (kind of like when we don't put method outputs in a variable)
}

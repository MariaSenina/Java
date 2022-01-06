package com.senina.maria.java.collections.set;

import java.util.Set;

public class SetExploration {
    public static void main(String[] args) {
        Set<String> set = Set.of("Apple", "Banana", "Cat");
        System.out.println("Original set: " + set);
    }
    //Set is immutable
    //Set does not allow for duplicate values
    //Set does not care about the position:
    // -> No indexes
    // -> The insert order is not respected
}

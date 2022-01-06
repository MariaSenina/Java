package com.senina.maria.java.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMethods {
    //TreeSet provides us with more operations because the data in it is sorted
    //TreeSet provides us with an implementation of a NavigableSet

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Set.of(64, 54, 34, 12, 99));
        System.out.println("Numbers: " + numbers);

        System.out.println("Next number lower than 40: " + numbers.floor(40)); //inclusive (<=40)
        System.out.println("Next number lower than 40: " + numbers.lower(40)); //non-inclusive (<40)
        System.out.println("Next number higher than 40: " + numbers.ceiling(40)); //inclusive (>=40)
        System.out.println("Next number higher than 40: " + numbers.higher(40)); //non-inclusive (>40)

        System.out.println("Numbers between 20 and 80: " + numbers.subSet(34, 64)); //includes lower, not upper limit
        System.out.println("Numbers between 34 and 64 (inclusive): " + numbers.subSet(34, true,
                                                                                    64, true));
        System.out.println("Numbers up to 50: " + numbers.headSet(50));
        System.out.println("Numbers starting at 50: " + numbers.tailSet(50));
    }
}

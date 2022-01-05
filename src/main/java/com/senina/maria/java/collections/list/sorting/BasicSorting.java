package com.senina.maria.java.collections.list.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicSorting {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(123, 12, 3, 45);
        List<Integer> numbersArrayList = new ArrayList<>(numbers);

        //BasicSorting using static sort() method in Collections
        System.out.println("Unsorted: " + numbersArrayList);
        Collections.sort(numbersArrayList);
        System.out.println("Sorted: " + numbersArrayList);

        //NOTE: Only implementations of Comparable interface can be sorted using Collections.sort!
    }
}

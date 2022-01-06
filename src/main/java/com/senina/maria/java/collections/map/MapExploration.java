package com.senina.maria.java.collections.map;

import java.util.Map;

public class MapExploration {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);
        System.out.println("Map: " + map);
    }

    //Map does NOT extend Collections interface
    //Map is used to store key-value pairs
    //Implementations:
    // -> HashMap:
    //      -> Underlying data structure is a Hash Table
    //      -> Unsorted & unordered
    //      -> Allows for null key values
    // -> HashTable:
    //      -> Underlying data structure is a Hash Table
    //      -> Unsorted & unordered
    //      -> Synchronized, thread-safe version of HashMap
    //      -> Does not allow for null key values
    // -> LinkedHashMap:
    //      -> Insertion order is maintained
    //      -> Slower insertion/deletion
    //      -> Faster iteration
    // -> TreeMap:
    //      -> Sorted order is maintained
    //      -> Implements NavigableMap
}

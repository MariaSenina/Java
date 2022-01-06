package com.senina.maria.java.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExploration {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);
        System.out.println("Map: " + map);

        System.out.println("Value associated with 'Z': " + map.get("Z"));
        System.out.println("Size: " + map.size());
        System.out.println("Empty: " + map.isEmpty());
        System.out.println("Contains key 'F': " + map.containsKey("F"));
        System.out.println("Contains value '3': " + map.containsValue(3));
        System.out.println("Get all keys: " + map.keySet());
        System.out.println("Get all values: " + map.values());
        System.out.println();

        Map<String, Integer> hashmap = new HashMap<>(map);
        System.out.println("HashMap: " + hashmap);
        hashmap.put("F", 5); //also returns the old value (if any)
        System.out.println("After adding an element: " + hashmap);
        hashmap.put("Z", 11); //also returns the old value
        System.out.println("After changing the value of 'Z': " + hashmap);
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

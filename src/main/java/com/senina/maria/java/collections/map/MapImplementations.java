package com.senina.maria.java.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapImplementations {
    public static void main(String[] args) {
        //HashMap
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("Z", 5);
        hashmap.put("A", 15);
        hashmap.put("F", 25);
        hashmap.put("L", 250);
        System.out.println("Hashmap: " + hashmap); // -> very efficient, since it doesn't care about order at all

        //LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Z", 5);
        linkedHashMap.put("A", 15);
        linkedHashMap.put("F", 25);
        linkedHashMap.put("L", 250);
        System.out.println("LinkedHashMap: " + linkedHashMap); // -> insertion oder maintained

        //TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Z", 5);
        treeMap.put("A", 15);
        treeMap.put("F", 25);
        treeMap.put("L", 250);
        System.out.println("TreeMap: " + treeMap); // -> naturally sorted
    }
}

package com.senina.maria.java.concurrency.concurrentCollections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapTest {
    public static void main(String[] args) {
        ConcurrentMap<Character, LongAdder> occurrences = new ConcurrentHashMap<>();

        String string = "ABCD ABCD ABCD";
        for (char character : string.toCharArray()) {
            occurrences.computeIfAbsent(character, ch -> new LongAdder()).increment();
        }
        System.out.println(occurrences);
    }

    //LongAdder provides atomic increment
    //ConcurrentMap offers all the typical Map operations as well as computeIfAbsent method.
    //computeIfAbsent method takes a key and a lambda expression

    //NOTE: Local variables are NOT shared between threads

    //ConcurrentHashMap uses locks to block of different regions of a Hashtable
}

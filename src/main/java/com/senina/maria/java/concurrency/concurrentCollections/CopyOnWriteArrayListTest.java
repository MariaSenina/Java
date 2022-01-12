package com.senina.maria.java.concurrency.concurrentCollections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

        //threads - 3
        list.add("Ant");
        list.add("Bat");
        list.add("Cat");

        //threads - 10000
        for (String element : list) {
            System.out.println(element);
        }
    }

    //CopyOnWrite:
    // -> thread-safe version of ArrayList
    // -> all mutative operations are implemented by making a copy of the original array
    // -> can be too costly (because of the amount of resources that can be involved in creating an array copy)
    // -> very efficient if the array will be read more than it will be modified
    // -> only needs to synchronize the .add() method because the other threads can be reading the original array.
    //    (once the insertion - copy - is complete, the new (copied) array becomes the 'original' array)
    // -> custom algorithms can be written to ensure desirable performance
}

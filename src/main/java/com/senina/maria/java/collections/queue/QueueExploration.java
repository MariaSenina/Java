package com.senina.maria.java.collections.queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExploration {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("Apple");
        queue.addAll(List.of("Zebra", "Monkey", "Cat"));

        System.out.println("Queue: " + queue); // -> sorted

        queue.poll(); // -> takes the top element of the queue (reads and removes)
        System.out.println("After poll(): " + queue);
    }

    //A queue is used when we want to arrange things in the order we want to process them
    // (similar to a to-do list)
    //Queue extends Collection
    // -> supports all the collection methods
    // -> has additional methods
    //Implementations:
    // -> Priority Queue: elements are sorted in a natural order (changing the order is also possible)
}

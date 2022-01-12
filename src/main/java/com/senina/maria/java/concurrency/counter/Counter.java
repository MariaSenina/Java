package com.senina.maria.java.concurrency.counter;

public class Counter {
    private int i = 0;

    //'synchronized' means that only one thread can run this method at any one time
    synchronized public void increment() {
        i++; //i++ is not a thread-safe operation (not atomic)
    }

    public int getI() {
        return i;
    }
}

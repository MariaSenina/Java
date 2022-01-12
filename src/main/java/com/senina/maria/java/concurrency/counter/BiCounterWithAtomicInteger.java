package com.senina.maria.java.concurrency.counter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();

    public void incrementI() {
        i.incrementAndGet();
    }

    public int getI() {
        return i.get();
    }

    public void incrementJ() {
        j.incrementAndGet();
    }

    public int getJ() {
        return j.get();
    }

    //AtomicInteger provides basic atomic operations
    //NOTE: This approach will not work for everything! Because of the simplicity of the operations it provides
    // (mostly works for counters)
}

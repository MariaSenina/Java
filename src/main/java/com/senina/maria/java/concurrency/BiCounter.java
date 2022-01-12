package com.senina.maria.java.concurrency;

public class BiCounter {
    private int i = 0;
    private int j = 0;

    synchronized public void incrementI() {
        i++;
    }

    public int getI() {
        return i;
    }

    synchronized public void incrementJ() {
        j++;
    }

    public int getJ() {
        return j;
    }

    //The issue with having both methods synchronized is that ->
    //-> only one thread is allowed to access ANY of the synchronized methods at any point in time
    //Even though these methods are not related at all, if one of the methods is being accessed by one thread,
    //the other method is also not allowed to be accessed by any other thread
}

package com.senina.maria.java.loops;

public class ContinuePractice {
    //print only even numbers
    public void printEvenNumbers(int limit) {
        for(int i = 1; i <= limit; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

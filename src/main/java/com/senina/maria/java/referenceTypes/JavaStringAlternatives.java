package com.senina.maria.java.referenceTypes;

public class JavaStringAlternatives {

    public static void main(String[] args) {
        //StringBuffer is a synchronized class that creates a mutable String. Synchronized means ready for multithreading
        //this means that there is a time penalty imposed on it when you use it in a single thread (it can get really slow)
        StringBuffer sb = new StringBuffer("Test");
        System.out.println("Original sb: " + sb);
        sb.append(" 123");
        System.out.println("Mutated sb: " + sb);

        //StringBuilder is not a synchronized class that creates a mutable String
        StringBuilder sb1 = new StringBuilder("Test 2");
        System.out.println("sb1: " + sb1);
    }
}

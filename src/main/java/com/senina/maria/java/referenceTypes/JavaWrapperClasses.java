package com.senina.maria.java.referenceTypes;

public class JavaWrapperClasses {

    public static void main(String[] args) {
        //creating instances of wrapper classes using "new"
        Integer integer = new Integer(5);
        Integer integer2 = new Integer("5");

        //creating instances of wrapper classes using .valueOf
        Integer integer1 = Integer.valueOf(5);
        Integer integer3 = Integer.valueOf("5");
        // ^ recommended; check if there is already an object with the given value and, if so, it doesn't create a new
        //object, merely a new pointer to the same object (it's okay because wrapper classes are immutable)

        //the difference between the two creating methods
        System.out.println(integer == integer2); //compares where the values are stored
        System.out.println(integer1 == integer3); //compares the values themselves

        //Auto Boxing uses Integer.valueOf()
        Integer seven = 7;

        //constants
        System.out.println("Max value: " + Integer.MAX_VALUE);
        System.out.println("Min value: " + Integer.MIN_VALUE);
        System.out.println("Size (bits): " + Integer.SIZE);
        System.out.println("Size (bytes): " + Integer.BYTES);
    }
}

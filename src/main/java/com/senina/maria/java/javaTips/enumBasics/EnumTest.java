package com.senina.maria.java.javaTips.enumBasics;

import java.sql.SQLOutput;
import java.util.Arrays;

enum Season {
    WINTER(1), SPRING(2), SUMMER(3), FALL(4);
    //0, 1, 2, 3 -> ordinals

    private int value;

    private Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class EnumTest {
    public static void main(String[] args) {
        Season season = Season.WINTER;

        Season season1 = Season.valueOf("SUMMER"); //has to be an exact match
        System.out.println("Season1: " + season1);
        System.out.println("Season1 ordinal: " + season1.ordinal()); //values are assigned an 'ordinal' by default
        System.out.println("SPRING ordinal: " + Season.SPRING.ordinal());
        System.out.println("SPRING value: " + Season.SPRING.getValue());

        System.out.println(Arrays.toString(Season.values()));
    }

    //Enums allow us to restrict acceptable values.
    //Enum is very similar to a class.
    //You can:
    // -> pass them into methods,
    // -> store them into instance variables
}

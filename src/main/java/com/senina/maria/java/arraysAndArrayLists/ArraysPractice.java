package com.senina.maria.java.arraysAndArrayLists;

public class ArraysPractice {

    //enhanced "for" loop
    public static int sumOfMarks(int[] marks) {
        int sum = 0;

        for (int mark: marks) {
            sum += mark;
        }

        return sum;
    }
}

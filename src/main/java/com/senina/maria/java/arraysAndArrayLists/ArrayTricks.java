package com.senina.maria.java.arraysAndArrayLists;

import java.util.Arrays;

public class ArrayTricks {
    public static void main(String[] args) {
        int[] marks = {100, 98, 91, 97, 100};

        //print elements of an array without a loop
        System.out.println(Arrays.toString(marks));

        //fill array in bulk (~set default values)
        Arrays.fill(marks, 100);
        System.out.println(Arrays.toString(marks));

        //compare arrays
        int[] numbers1 = {1, 2, 3};
        int [] numbers2 = {1, 2, 3};
        int [] numbers3 = {3, 2, 3};

        System.out.println(Arrays.equals(numbers1, numbers2)); //returns "true" only if arrays match exactly
        System.out.println(Arrays.equals(numbers1, numbers3));

        //sort arrays
        Arrays.sort(numbers3); // -> {2, 3, 3}
    }
}

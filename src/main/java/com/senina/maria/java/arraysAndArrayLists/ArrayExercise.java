package com.senina.maria.java.arraysAndArrayLists;

public class ArrayExercise {

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 11};

        printValuesOfAnArray(array);
    }

    public static void printValuesOfAnArray(int[] array) {
        //regular loop
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        //enhanced for loop
        for (int j : array) {
            System.out.println(j);
        }
    }

}

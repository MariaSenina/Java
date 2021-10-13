package com.senina.maria.java.arraysAndArrayLists;

import java.math.BigDecimal;

public class StudentTest {
    public static void main(String[] args) {
        int[] marksR = {100, 50, 99, 97, 77};

        Student student = new Student("Rexxinho", marksR);

        int number = student.getNumberOfMarks();
        System.out.println("Number of marks: " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("Sum of marks: " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("Max mark: " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("Min mark: " + minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("Average: " + average);
    }
}

package com.senina.maria.java.arraysAndArrayLists;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<>();

    public Student(String name, int... marks) {
        this.name = name;
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public String toString() {
        return name + marks;
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        int maximum = Integer.MIN_VALUE;
        for (int mark : marks) {
            if (mark > maximum) {
                maximum = mark;
            }
        }
        return maximum;
    }

    public int getMinimumMark() {
        int minimum = Integer.MAX_VALUE;
        for (int mark : marks) {
            if (mark < minimum) {
                minimum = mark;
            }
        }
        return minimum;
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }

    public void addNewMark(int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index) {
        marks.remove(index);
    }
}

package com.senina.maria.java.collections.list.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionTest {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Mashi"),
                                        new Student(100, "Adam"),
                                        new Student(2, "Eve"));
        List<Student> studentArrayList = new ArrayList<>(students);
        System.out.println("Unsorted: " + studentArrayList);

        Collections.sort(studentArrayList);
        System.out.println("Sorted by 'id': " + studentArrayList);
    }
}

package com.senina.maria.java.collections.list.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getId(), student1.getId());
    }
}

public class StudentsCollectionTest {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Mashi"),
                                        new Student(100, "Adam"),
                                        new Student(2, "Eve"));
        List<Student> studentArrayList = new ArrayList<>(students);
        System.out.println("Unsorted: " + studentArrayList);

        Collections.sort(studentArrayList);
        System.out.println("Sorted by 'id', asc: " + studentArrayList);

        Collections.sort(studentArrayList, new DescendingStudentComparator());
        System.out.println("Sorted by 'id', desc: " + studentArrayList);

        studentArrayList.sort(new DescendingStudentComparator());
        System.out.println("Sorted by 'id', desc, <List>.sort(): " + studentArrayList);
    }
}

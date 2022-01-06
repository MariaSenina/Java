package com.senina.maria.java.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceImplementations {
    public static void main(String[] args) {
        //HashSet
        Set<Integer> numbers = new HashSet<>();

        numbers.add(765432);
        numbers.add(76543);
        numbers.add(7654);
        numbers.add(765);
        numbers.add(76);

        System.out.println("Numbers: " + numbers); //items not stored in insertion order or sorted

        //LinkedHashSet
        Set<Integer> numbersLinked = new LinkedHashSet<>();

        numbersLinked.add(765432);
        numbersLinked.add(76543);
        numbersLinked.add(7654);
        numbersLinked.add(765);
        numbersLinked.add(76);

        System.out.println("Linked numbers: " + numbersLinked); //insertion order maintained

        //TreeSet
        Set<Integer> numbersTree = new TreeSet<>();

        numbersTree.add(765432);
        numbersTree.add(76543);
        numbersTree.add(7654);
        numbersTree.add(765);
        numbersTree.add(76);

        System.out.println("Tree numbers: " + numbersTree); //sorted
    }
}

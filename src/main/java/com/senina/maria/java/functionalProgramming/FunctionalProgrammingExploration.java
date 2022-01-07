package com.senina.maria.java.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingExploration {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cat", "Dog");

        System.out.println("Basic:");
        System.out.print("Print elements: ");
        printBasic(list);
        System.out.println();
        System.out.print("Print elements ending with 'at': ");
        printBasicWithFilter(list);
        System.out.println();

        System.out.println("Functional:");
        System.out.print("Print elements: ");
        printWithFP(list);
        System.out.println();
        System.out.print("Print elements ending with 'at': ");
        printWithFPWithFilter(list);
        System.out.println();
    }

    private static void printBasic(List<String> list) {
        for (String string : list) {
            System.out.print(string + " ");
        }
    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(element -> System.out.print("element - " + element + " "));
    }

    private static void printBasicWithFilter(List<String> list) {
        for (String string : list) {
            if(string.endsWith("at")) {
                System.out.print(string + " ");
            }
        }
    }
    private static void printWithFPWithFilter(List<String> list) {
        list.stream().
                filter(element -> element.endsWith("at")).
                forEach(element -> System.out.print("element - " + element + " "));
    }
}

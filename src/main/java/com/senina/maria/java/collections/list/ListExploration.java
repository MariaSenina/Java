package com.senina.maria.java.collections.list;

import java.util.List;

public class ListExploration {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Bat", "Cat");

        System.out.println("Words: " + words);

        System.out.println("Size: " + words.size());

        System.out.println("Empty: " + words.isEmpty());

        System.out.println("Element at 0: " + words.get(0));

        System.out.println("Contains 'Dog': " + words.contains("Dog"));
    }

    //List is immutable. In order to be able to modify values in a List we need to create one of the following:
    //ArrayList, LinkedList, Vector

    //Underlying structures:
    //ArrayList -> Array
    //LinkedList -> LinkedList
    //Vector -> Array

    //ArrayList vs LinkedList:
    //In ArrayList, elements are linked to an index, whereas in LinkedList elements are linked to each other
    //Elements in an ArrayList can be accessed faster/easier than the elements in a LinkedList
    // -> To access an element in an ArrayList, Java simply looks for an element linked to a particular requested index.
    //    For example, if we ask to print an element at index 5 it just goes to that index and accesses the element
    // -> To access an element in a LinkedList, Java has to start at the first element and basically count until the
    //    number of the element requested. Naturally, this takes more time and consumes more resources.
    //Adding/removing elements in a LinkedList is faster/simpler that adding/removing elements in an ArrayList
    // -> To remove a specified element from a LinkedList, Java needs to simply break the existing link from the
    //    previous element to the element that we want to delete and create a new link to the next element. For example,
    //    if we have an array of ["Cat", "Mouse", "Dog"] elements, and we want to remove "Mouse", Java will break the
    //    link between "Cat" and "Mouse" (and "Mouse" and "Dog", if it's a doubly linked list) after which it will create
    //    a new link between "Cat" and "Dog"
    // -> To remove a particular element for an ArrayList, Java has to move every single following element one space to
    //    the left. this is very time/resource consuming. Fir example, if we want to delete a 2nd element from an array
    //    with 5 elements, Java will have to move the element in the 3rd place to the second place, the element in the
    //    4th place to the 3rd place and so on, until the end of the array is reached.

    //ArrayList vs Vector:
    //Most Vector methods are synchronized, which makes it thread-safe. This comes with some performance issues.
    //ArrayList methods are not synchronized and, therefore, not thread-safe.
    //Fun note: Vector has been present since the first version of Java
}

package com.senina.maria.java.generics;

import java.util.ArrayList;

public class MyCustomList<T extends Number> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public String toString() {
        return list.toString();
    }

    //Additional advantage to extending Number is that we get all the methods associated with Number
}

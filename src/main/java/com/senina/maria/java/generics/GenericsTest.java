package com.senina.maria.java.generics;

import java.util.List;

public class GenericsTest {

    //generic method example
    static <X> X doubleValue(X value) {
        return value;
    }

    //using wildcards:
    // -> upper-bound wild card
    static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for(Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // -> lower-bound wild card
    static void addACoupleOfValues(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1L);
    }

    public static void main(String[] args) {
        MyCustomList<Long> list = new MyCustomList<>();
        list.addElement(5L);
        list.addElement(7L);
        Long value = list.get(0);

        System.out.println("List: " + list);
        System.out.println(value);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(7));
        Integer number = list2.get(0);

        System.out.println("List 2: " + list2);
        System.out.println(number);
    }
}

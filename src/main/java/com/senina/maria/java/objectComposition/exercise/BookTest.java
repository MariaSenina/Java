package com.senina.maria.java.objectComposition.exercise;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book(123, "Object Oriented Programming with Java", "Ranga");

        book1.addReview(new Review(10, "Great book", 5));
        book1.addReview(new Review(101, "Awesome", 5));

        System.out.println(book1);
    }
}

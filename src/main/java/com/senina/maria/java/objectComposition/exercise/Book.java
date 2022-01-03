package com.senina.maria.java.objectComposition.exercise;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String name;
    private String author;
    private List<Review> reviews;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        reviews = new ArrayList();
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    @Override
    public String toString() {
        return String.format("Book id: %d, Book name: %s, Author name: %s \nReviews: \n %s", id, name, author, reviews);
    }
}

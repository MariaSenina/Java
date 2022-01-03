package com.senina.maria.java.objectComposition.exercise;

public class Review {
    private int id;
    private String description;
    private float rating;

    public Review (int id, String description, float rating) {
        this.id = id;
        this. description = description;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("Review id: %d, Description: %s, Rating: %f", id, description, rating);
    }
}

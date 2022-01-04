package com.senina.maria.java.abstractClassses;

public class Recipe1 extends AbstractRecipe {
    @Override
    void setUp() {
        System.out.println("Wash and dry all ingredients");
        System.out.println("Gather cooking utensils");
    }

    @Override
    void prepare() {
        System.out.println("Cut the ingredients");
        System.out.println("Mix the ingredients");
    }

    @Override
    void cleanUp() {
        System.out.println("Serve the dish");
        System.out.println("Clean up the cooking utensils");
    }
}

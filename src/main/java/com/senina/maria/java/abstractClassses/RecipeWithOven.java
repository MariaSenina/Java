package com.senina.maria.java.abstractClassses;

public class RecipeWithOven extends AbstractRecipe {
    @Override
    void setUp() {
        System.out.println("Turn on the oven");
        System.out.println("Wash and dry all ingredients");
        System.out.println("Gather cooking utensils");
    }

    @Override
    void prepare() {
        System.out.println("Cut the ingredients");
        System.out.println("Mix the ingredients");
        System.out.println("Put ingredients in the oven");
    }

    @Override
    void cleanUp() {
        System.out.println("Turn off the oven");
        System.out.println("Serve the dish");
        System.out.println("Clean up the cooking utensils");
    }
}

package com.senina.maria.java.abstractClassses;

public class RecipeTest {
    public static void main(String[] args) {
        Recipe1 recipe = new Recipe1();
        System.out.println("Recipe 1:");
        recipe.execute();

        System.out.println();

        RecipeWithOven recipeWithOven = new RecipeWithOven();
        System.out.println("Recipe with oven:");
        recipeWithOven.execute();
    }
}

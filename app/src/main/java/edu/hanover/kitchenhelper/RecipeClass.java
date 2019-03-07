package edu.hanover.kitchenhelper;

import java.util.ArrayList;

public class RecipeClass {
    //data members
    private String recipeName;
    private String timeLimit;
    private ArrayList<String> ingredients;
    private ArrayList<String> directions;
    private String picture;

    //constructor
    public RecipeClass (String name, String time, ArrayList<String> ing, ArrayList<String> instructions, String pic) {
        recipeName = name;
        timeLimit = time;
        ingredients = ing;
        directions = instructions;
        picture = pic;
    }

    //addRecipe function to add recipe to favorites screen
    public static void addRecipe() {
        return;
    }

    //deleteRecipe function to delete recipe from favorites screen
    public static void deleteRecipe() {
        return;
    }
}

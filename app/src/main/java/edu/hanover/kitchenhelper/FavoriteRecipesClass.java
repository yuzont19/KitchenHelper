package edu.hanover.kitchenhelper;

import java.util.ArrayList;

public class FavoriteRecipesClass {
    //date members
    private String linkToRecipe;
    private String recipeName;
    private ArrayList<String> ingredients;

    //constructor
    public FavoriteRecipesClass(String link, String recipe, ArrayList<String> ing) {
        linkToRecipe = link;
        recipeName = recipe;
        ingredients = ing;
    }

    //favorite recipes function
    public static void favorite() {
        return;
    }

    //unfavorite recipes function
    public static void unfavorite() {
        return;
    }
}

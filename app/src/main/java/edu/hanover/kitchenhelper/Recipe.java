package edu.hanover.kitchenhelper;

import android.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    //data members
    private String recipeName;
    private String timeLimit;
    private ArrayList<String> ingredients;
    private ArrayList<String> directions;
    private String picture;
    private ArrayList<Recipe> recipeTable;
    private static ConversionTable conversionTable = new ConversionTable();

    //constructor
    public Recipe (String name, String time, ArrayList<String> ing, ArrayList<String> instructions, String pic) {
        recipeName = name;
        timeLimit = time;
        ingredients = ing;
        directions = instructions;
        picture = pic;
    }

    //get recipeName
    public String getRecipeName(){ return this.recipeName; }
    //get timeLimit
    public String getTime() { return this.timeLimit; }
    //get ingredients list
    public ArrayList<String> getIngredient() { return this.ingredients; }
    //get directions
    public ArrayList<String> getDirections() { return this.directions; }
    //get picture if applicable
    public String getPicture() { return this.picture; }


    //addRecipe function to add recipe to database
    public static void addRecipe() {
        return;
    }

    //deleteRecipe function to delete recipe from database
    public static void deleteRecipe() {
        return;
    }


    static class ConversionTable {
        List<Pair<String, Measurement>> table = new ArrayList<>();

        ConversionTable() {
            //populate the table
            addConversion("tsp", new Measurement("mL", 5));

            addConversion("T", new Measurement("mL", 15));

            addConversion("fl oz", new Measurement("mL", 30));
        }

        void addConversion(String imperial, Measurement measurement) {
            table.add(new Pair<String, Measurement>(imperial, measurement));
        }
    }
}

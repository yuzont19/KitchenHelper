package edu.hanover.kitchenhelper;

import android.util.Pair;

import java.util.ArrayList;
import java.util.List;

import static edu.hanover.kitchenhelper.Ingredients.addIngredient;

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

    //getters and setters
    public String getRecipeName(){ return this.recipeName; }
    public String getTime() { return this.timeLimit; }
    public ArrayList<String> getIngredient() { return this.ingredients; }
    public ArrayList<String> getDirections() { return this.directions; }
    public String getPicture() { return this.picture; }


    //TODO addRecipe function to add recipe to database
    public static void addRecipe() { return; }

    //TODO deleteRecipe function to delete recipe from database
    public static void deleteRecipe() {
        return;
    }


    static class ConversionTable {
        List<Pair<String, Measurement>> table = new ArrayList<>();

        //TODO finish the rest of this table
        ConversionTable() {
            //populate the table
            addConversion("tsp", new Measurement("mL", 5));

            addConversion("tbsp", new Measurement("mL", 15));

            addConversion("fl oz", new Measurement("mL", 30));

            addConversion("cup", new Measurement("mL", 240));

            addConversion("pint", new Measurement("mL", 475));

            addConversion("quart", new Measurement("mL", 950));

            addConversion("gal", new Measurement("mL", 3800));
        }

        void addConversion(String imperial, Measurement measurement) {
            table.add(new Pair<String, Measurement>(imperial, measurement));
        }
    }
}

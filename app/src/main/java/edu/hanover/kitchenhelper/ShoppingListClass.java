package edu.hanover.kitchenhelper;

public class ShoppingListClass {
    //data members
    private String name;
    private String quantity;
    private boolean bought;

    //constructor
    public ShoppingListClass(String ingredient, String num_items, boolean acquired) {
        name = ingredient;
        quantity = num_items;
        bought = acquired;
    }

    //TODO addIngredient function that adds ingredient to shopping list
    public static String addIngredient() { return "this is not implemented";
    }

    //TODO deleteIngredient function that deletes ingredient on shopping list
    public static String deleteIngredient() {
        return "this is not implemented";
    }
}

package edu.hanover.kitchenhelper;

public class Ingredients {
    //data members
    private String name;
    private Integer quantity;
    private boolean bought;
    private Integer ingredientID;

    //constructors
    public Ingredients() {}

    public Ingredients(String ingredientName, Integer num_items, boolean acquired, Integer id) {
        name = ingredientName;
        quantity = num_items;
        bought = acquired;
        ingredientID = id;
    }

    //properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getID() {
        return this.ingredientID;
    }

    public void setID(Integer ingredientID) {
        this.ingredientID = ingredientID;
    }

    public boolean isBought() {
        return bought;
    }

    //Class methods
    //TODO addIngredient function that adds ingredient to shopping list database
    public static String addIngredient() {
        return "this is not implemented";
    }

    //TODO deleteIngredient function that deletes ingredient on shopping list database
    public static String deleteIngredient() {
        return "this is not implemented";
    }

}

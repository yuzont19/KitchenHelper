package edu.hanover.kitchenhelper;

import java.util.ArrayList;

public final class Query {
    //data members
    private ArrayList<String> ingredients;

    //constructor
    public Query(ArrayList<String> A) {
        ingredients = A;
    }

    public String getQueryString() {
        String first_ing = ingredients.get(0);
        String second_ing = ingredients.get(1);
        String result_str = first_ing + "," + second_ing;
        String result = "http://www.recipepuppy.com/api/?i=" + result_str;

        return result;
    }
}

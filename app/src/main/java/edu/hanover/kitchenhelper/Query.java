package edu.hanover.kitchenhelper;

import java.util.ArrayList;

public final class Query {
    //data members
    private ArrayList<String> ingredients;

    //constructor
    public Query(ArrayList<String> A) {
        ingredients = A;
    }

    public static String getQueryString(ArrayList<String> A) {
        String first_ing = A.get(0);
        String second_ing = A.get(1);
        String result_str = first_ing + "," + second_ing;
        String result = "http://www.recipepuppy.com/api/?i=" + result_str;

        return result;

    }
}

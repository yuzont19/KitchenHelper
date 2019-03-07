package edu.hanover.kitchenhelper;

import org.junit.Test;

import java.util.ArrayList;

public class QueryTest {
    @Test
    public void twoIngredientQueryIsValid(){
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("banana");
        ingredients.add("apple");
        assert(Query.getQueryString(ingredients).equals("http://www.recipepuppy.com/api/?i=banana,apple"));
    }
}
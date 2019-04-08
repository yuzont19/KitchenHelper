package edu.hanover.kitchenhelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ShoppingList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);
    }

    //grabs the two texts for name and quantity and uses that to add ingredients to the database
    public void onClickAddIngredient(View view) {
        DatabaseHelper dbHandler = new DatabaseHelper(this);
        EditText name = (EditText) findViewById(R.id.ingredient);
        String ingredientName = name.getText().toString();
        EditText quantity = (EditText) findViewById(R.id.quantity);
        Integer quantityAmount = Integer.parseInt(quantity.getText().toString());
        Ingredients ingredient = new Ingredients(ingredientName, quantityAmount, false, 1);
        dbHandler.addIngredients(ingredient);
    }

    //loads the database table to see if ingredients are added
    public void onClickLoadDatabase(View view) {
        DatabaseHelper dbHandler = new DatabaseHelper(this);
        dbHandler.loadHandler();
    }
}

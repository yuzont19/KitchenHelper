package edu.hanover.kitchenhelper;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;

public class ShoppingList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);
    }

    public void onClickAddIngredient(View view) {
        DatabaseHelper dbHandler = new DatabaseHelper(this);
        EditText name = (EditText) findViewById(R.id.ingredient);
        String ingredientName = name.getText().toString();
        EditText quantity = (EditText) findViewById(R.id.quantity);
        Integer quantityAmount = Integer.parseInt(quantity.getText().toString());
        Ingredients ingredient = new Ingredients(ingredientName, quantityAmount, false, 1);
        dbHandler.addIngredients(ingredient);
    }

    public void onClickLoadDatabase(View view) {
        DatabaseHelper dbHandler = new DatabaseHelper(this);
        dbHandler.loadHandler();
    }
}

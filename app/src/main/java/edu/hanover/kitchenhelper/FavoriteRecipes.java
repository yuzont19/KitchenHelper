package edu.hanover.kitchenhelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FavoriteRecipes extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_recipes);
    }

    public void onClickAddRecipe(View view) {
        EditText name = (EditText) findViewById(R.id.recipeName);
        EditText time = (EditText) findViewById(R.id.timeLimit);
        EditText ingredients = (EditText) findViewById(R.id.ingredients);
        EditText directions = (EditText) findViewById(R.id.directions);
        String recipeName = name.getText().toString();
        String timeLimit = time.getText().toString();
        String ingredientsList = ingredients.getText().toString();
        String instructions = directions.getText().toString();
        Recipe newRecipe = new Recipe(recipeName, timeLimit, ingredientsList, instructions, null);
        TextView result = findViewById(R.id.resultRecipe);
        result.setText((CharSequence) newRecipe);
    }
}

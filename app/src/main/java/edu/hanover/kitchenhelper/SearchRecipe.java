package edu.hanover.kitchenhelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import static edu.hanover.kitchenhelper.R.*;

public class SearchRecipe extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_search_recipe);
    }

    public void onSearchClick(View view) {
        ArrayList<String> ingredients = new ArrayList<>();
        EditText first = (EditText) findViewById(id.first_ing);
        String firstIng = first.getText().toString();
        EditText second = (EditText) findViewById(id.second_ing);
        String secondIng = second.getText().toString();
        ingredients.add(firstIng);
        ingredients.add(secondIng);
        Query two_ing = new Query(ingredients);
        String queryResult = two_ing.getQueryString();
        TextView result = findViewById(id.result);
        result.setText(queryResult);
    }
}

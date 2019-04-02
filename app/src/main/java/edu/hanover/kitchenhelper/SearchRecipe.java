package edu.hanover.kitchenhelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
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
//        String firstIng = findViewById(id.first_ing).toString();
//        String secondIng = findViewById(id.second_ing).toString();
//        ingredients.add(firstIng);
//        ingredients.add(secondIng);
        Query two_ing = new Query(ingredients);
        String queryResult = two_ing.getQueryString();
        TextView result = findViewById(id.result);
        result.setText(queryResult);
    }
}

package edu.hanover.kitchenhelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called when the search recipe button is clicked
    public void onRecipeClick(View view) {
        startActivity(new Intent(MainActivity.this, SearchRecipe.class));
    }

    //Called when the favorite recipe button is clicked
    public void onFavoriteClick(View view) {
        startActivity(new Intent(MainActivity.this, FavoriteRecipes.class));
    }

    //Called when the shopping list button is clicked
    public void onShopClick(View view) {
        startActivity(new Intent(MainActivity.this, ShoppingList.class));
    }

    //Called when the measurement converter button is clicked
    public void onMeasureClick(View view) {
        startActivity(new Intent(MainActivity.this, MeasurementConverter.class));
    }

    public void onInfoClick(View view) {
        startActivity(new Intent(MainActivity.this, Info.class));
    }
}
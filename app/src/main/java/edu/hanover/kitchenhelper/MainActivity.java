package edu.hanover.kitchenhelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called when the search recipe button is clicked
    public void onRecipeClick(View view) {
        // Do something in response to button click
    }

    //Called when the favorite recipe button is clicked
    public void onFavoriteClick(View view) {
        // Do something in response to button click
    }

    //Called when the shopping list button is clicked
    public void onShopClick(View view) {
        // Do something in response to button click
    }

    //Called when the measurement converter button is clicked
    public void onMeasureClick(View view) {
        // Do something in response to button click
    }
}

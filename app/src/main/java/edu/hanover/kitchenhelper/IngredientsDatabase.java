package edu.hanover.kitchenhelper;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

public class IngredientsDatabase extends SQLiteOpenHelper {
    //information of database
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "shoppingListDB.db";
    private static final String TABLE_NAME = "ShoppingList";
    private static final String INGREDIENT_ID = "IngredientID";
    private static final String INGREDIENT_NAME = "IngredientName";
    private static final String QUANTITY = "Quantity";
    private static final String BOUGHT = "Bought";

    //initialize the database
    public IngredientsDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE" + TABLE_NAME + "(" + INGREDIENT_ID +
                "INTEGER PRIMARYKEY," + INGREDIENT_NAME + "TEXT " + QUANTITY + "TEXT," + BOUGHT + "TEXT )";
        db.execSQL(CREATE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {}
    public String loadHandler() {
        String result = "";
        String query = "Select*FROM" + TABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            int result_0 = cursor.getInt(0);
            String result_1 = cursor.getString(1);
            result += String.valueOf(result_0) + " " + result_1 +
                    System.getProperty("line.separator");
        }
        cursor.close();
        db.close();
        return result;
    }
    public void addIngredient(Ingredients ingredient) {
        ContentValues values = new ContentValues();
        values.put(INGREDIENT_ID, ingredient.getID());
        values.put(INGREDIENT_NAME, ingredient.getName());
        values.put(QUANTITY, ingredient.getQuantity());
        values.put(BOUGHT, ingredient.isBought());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public Ingredients findIngredient(Ingredients ingredientName) {
        String query = "Select * FROM " + TABLE_NAME + "WHERE" + INGREDIENT_NAME + " = " + "'" + ingredientName + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Ingredients ingredient = new Ingredients();
        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            ingredient.setID(Integer.parseInt(cursor.getString(0)));
            ingredient.setName(cursor.getString(1));
            cursor.close();
        } else {
            ingredient = null;
        }
        db.close();
        return ingredient;
    }
    public boolean deleteIngredient(int ID) {

        boolean result = false;
        String query = "Select*FROM" + TABLE_NAME + "WHERE" + INGREDIENT_ID + "= '" + String.valueOf(ID) + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Ingredients ingredient = new Ingredients();
        if (cursor.moveToFirst()) {
            ingredient.setID(Integer.parseInt(cursor.getString(0)));
            db.delete(TABLE_NAME, INGREDIENT_ID + "=?",
                    new String[] {
                String.valueOf(ingredient.getID())
            });
            cursor.close();
            result = true;
        }
        db.close();
        return result;
    }
    public boolean updateIngredient(int ID, String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues args = new ContentValues();
        args.put(INGREDIENT_ID, ID);
        args.put(INGREDIENT_NAME, name);
        return db.update(TABLE_NAME, args, INGREDIENT_ID + "=" + ID, null) > 0;
    }

}

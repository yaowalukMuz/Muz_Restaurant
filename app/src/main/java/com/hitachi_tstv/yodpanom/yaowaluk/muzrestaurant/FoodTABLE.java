package com.hitachi_tstv.yodpanom.yaowaluk.muzrestaurant;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by musz on 9/1/2016.
 */
public class FoodTABLE {
    // Explicit
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase,readSqLiteDatabase;

    public static final String FOOD_TABLE = "foodTABLE";
    public static final String COLUM_ID_FOOD = "_id";
    public static final String COLUM_FOOD = "Food";
    public static final String COLUM_SOURCE = "Source";
    public static final String COLUM_PRICE = "Price";

    public FoodTABLE(Context context) {
        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
    }// Constructor

    public long addNewFood(String strFood, String strSource, String strPrice) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUM_FOOD,strFood);
        objContentValues.put(COLUM_SOURCE , strSource);
        objContentValues.put(COLUM_PRICE,strPrice);
        return readSqLiteDatabase.insert(FOOD_TABLE,null,objContentValues);
    }

}// Main class

package com.hitachi_tstv.yodpanom.yaowaluk.muzrestaurant;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by musz on 9/2/2016.
 */
public class SaleTABLE {

    //Explicit
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String SALE_TABLE = "saleTABLE";
    public static final String COLUM_ID_ORDER = "_id";
    public static final String COLUM_OFFICER = "Officer";
    public static final String COLUM_DESK = "Desk";
    public static final String COLUM_FOOD = "Food";
    public static final String COLUM_ITEM = "Item";

    public SaleTABLE(Context context) {
        objMySQLiteOpenHelper  = new MySQLiteOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();

    }//Constructor

    public long addNewSale(String strOfficer, String strDesk, String strFood, String strItem) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUM_OFFICER, strOfficer);
        objContentValues.put(COLUM_DESK, strDesk);
        objContentValues.put(COLUM_FOOD, strFood);
        objContentValues.put(COLUM_ITEM, strItem);
        return readSqLiteDatabase.insert(SALE_TABLE, null, objContentValues);
    }
}// Main Class

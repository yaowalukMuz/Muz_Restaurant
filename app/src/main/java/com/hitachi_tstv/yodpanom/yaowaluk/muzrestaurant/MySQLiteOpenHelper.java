package com.hitachi_tstv.yodpanom.yaowaluk.muzrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by musz on 9/1/2016.
 */
public class MySQLiteOpenHelper extends SQLiteOpenHelper {

    //Explicit
    private static final String DATABASE_NAME = "Restaurant.db";
    private static final int  DATABASE_VERSION = 1;
    private static final String CREATE_USER_TABLE = "create table userTABLE" +
            "(_id integer primary key,User text, Password text, Name text);";
    private static final String CREATE_FOOD_TABLE = "create table foodTABLE" +
            "(_id integer primary key, Food text, Source text, Price text);";
    private static final String CREATE_ORDER_TABLE = "create table orderTABLE" +
            "(_id integer primary key, Officer text, Desk text, Food text, Item text);";
    private static final String CREATE_SALE_TABLE = "create table saleTABLE" +
            "(_id integer  primary key, Officer text, Desk text, Food text, Item text);";


    public MySQLiteOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }// End Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USER_TABLE);
        db.execSQL(CREATE_FOOD_TABLE);
        db.execSQL(CREATE_ORDER_TABLE);
        db.execSQL(CREATE_SALE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

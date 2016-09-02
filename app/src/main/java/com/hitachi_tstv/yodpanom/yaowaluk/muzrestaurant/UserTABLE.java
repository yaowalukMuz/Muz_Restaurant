package com.hitachi_tstv.yodpanom.yaowaluk.muzrestaurant;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by musz on 9/1/2016.
 */
public class UserTABLE {
    // Explicit
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String USER_TABLE = "userTABLE";
    public static final String COLUMN_ID_USER = "_id";
    public static final String COLUM_USER = "User";
    public static final String COLUM_PASSWORD = "Password";
    public static final String COLUMN_NAME = "Name";


    public UserTABLE(Context context) {
        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase =  objMySQLiteOpenHelper.getReadableDatabase();
    }// Contructor

    public long addNameUser(String strUser,String  strPassword, String strName) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUM_USER, strUser);
        objContentValues.put(COLUM_PASSWORD, strPassword);
        objContentValues.put(COLUMN_NAME, strName);
        return readSqLiteDatabase.insert(USER_TABLE, null, objContentValues);

    }

}// Main Class

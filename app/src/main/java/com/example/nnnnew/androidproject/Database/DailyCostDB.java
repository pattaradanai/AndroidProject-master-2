package com.example.nnnnew.androidproject.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by nnnnew on 11/18/2015 AD.
 */
public class DailyCostDB extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "dailycost.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "transactions";
    public static final String COL_ID = "_id";
    public static final String COL_TYPE = "type";
    public static final String COL_CATALOGUE = "catalogue";
    public static final String COL_COST = "cost";
    public static final String COL_NUMBER_DAY = "numberofday";
    public static final String COL_DAY = "day";
    public static final String COL_MONTH = "month";
    public static final String COL_YEAR = "year";


    public DailyCostDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCreateTable = "CREATE TABLE %s (" +
                                "%s INTEGER PRIMARY KEY AUTOINCREMENT," +
                                "%s TEXT," +
                                "%s TEXT," +
                                "%s TEXT," +
                                "%s TEXT," +
                                "%s TEXT," +
                                "%s TEXT," +
                                "%s TEXT)";
        sqlCreateTable = String.format(sqlCreateTable, TABLE_NAME, COL_ID, COL_TYPE, COL_COST, COL_CATALOGUE, COL_NUMBER_DAY, COL_DAY, COL_MONTH, COL_YEAR);

        db.execSQL(sqlCreateTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

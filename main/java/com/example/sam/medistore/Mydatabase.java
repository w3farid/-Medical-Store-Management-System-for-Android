package com.example.sam.medistore;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.VisibleForTesting;

/**
 * Created by Sam on 4/9/2016.
 */
public class Mydatabase extends SQLiteOpenHelper {


    public static final String DATABASE_NAME="suraj.db";
    public static final String TABLE_NAME ="mtable";
    public static final String COL_1="ref_no";
    public static final String COL_2="medicine_name";
    public static final String COL_3="quantity";
    public static final String COL_4="unites";
    public static final String COL_5="priceperunite";
    public Mydatabase(Context context) {
        super(context, DATABASE_NAME, null, 1);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String s="create table mtable(ref_no int(10),medicine_name text(20),quantity int(10),unites int(10),priceperunite int(10))";
       db.execSQL(s);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exist mtable");
        onCreate(db);
    }

    public boolean insertData(String refno,String mname,String Quantity,String Unites,String PriceUnite)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_1,refno);
        contentValues.put(COL_2,mname);
        contentValues.put(COL_3,Quantity);
        contentValues.put(COL_4,Unites);
        contentValues.put(COL_5,PriceUnite);
        long result=db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
            return false;
        else
             return true;



    }
}

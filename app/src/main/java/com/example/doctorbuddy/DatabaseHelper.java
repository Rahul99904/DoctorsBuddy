package com.example.doctorbuddy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Signin.db";
    public static final String TABLE_NAME="Signin_table";
    public static final String COL_NAME="name";
    public static final String COL_PASS="pass";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table Signin_table(name Text,pass Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists Signin_table");
        onCreate(db);

    }


    public  boolean insert (String name,String pass){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("name",name);
        contentValues.put("pass",pass);
        long ins=db.insert("Signin_table",null,contentValues);
        if(ins==-1) return false;
        else return true ;

    }

    public Boolean login(String name,String pass){

        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor= db.rawQuery("select * from Signin_table where name=? and pass=?",new String[]{name,pass});
        if(cursor.getCount()>0) return  true;
        else return false;
    }
}

package com.example.sqlite1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
public class DatabaseCon extends SQLiteOpenHelper
{
    public static final String DataBasename="student.db";
    public static final String tablename="lab";
    public static final String col_1="UserId";
    public static final String col_2="password";

    public DatabaseCon(@Nullable Context context) {
        super(context, DataBasename, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+tablename + "(UserId  TEXT primary key , password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ tablename);
    }

    public boolean insert(String id, String pwd)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(col_1,id);
        cv.put(col_2,pwd);
        long result=db.insert(tablename,null,cv);
        if(result==-1)
        {
            return false;
        }
        else
        return true;
    }
    public Cursor getData() {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from "+ tablename,null);
        return cursor;

    }

    public void update()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        db.rawQuery("update "+ tablename +" SET password =\"selva\" where UserId=\"prabha\"",null );

    }
    public void delete()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        db.rawQuery("delete from "+ tablename+ " where "+ col_1+"=\"prabha\"",null);

    }
}



package com.example.sqlite2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseConnect extends SQLiteOpenHelper {
    public static final String databasename="Student.db";
    public static final String tablename="student";
    public static final String col1="student_id";
    public static final String col2="student_name";
    public static final String col3="university";
    public DataBaseConnect(@Nullable Context context) {
        super(context, databasename, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+tablename+"("+col1+" text primary key,"+ col2+ " text,"+ col3+" text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " +tablename);
    }

    public boolean insertt(String toString, String toString1, String toString2) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(col1,toString);
        cv.put(col2,toString1);
        cv.put(col3,toString2);
        long result=db.insert(tablename,null,cv);
        if(result==-1)
            return false;
        else
            return true;
    }

    public Cursor display() {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from "+tablename, null);
        return cursor;
    }

    public boolean deletee(String s1) {
        SQLiteDatabase db=this.getWritableDatabase();
        // String anu="anu";
        long l=db.delete(tablename,col1+"=?",new String[]{s1});
        if(l==-1)
        {
            return false;
        }
        else
            return true;
        // db.execSQL("delete from "+tablename+" where "+col1+"="+s1);
    }


    public boolean updatee(String string, String s, String toString) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(col2,s);
        contentValues.put(col3,toString);
        long r=db.update(tablename,contentValues,col1+"=?",new String[]{string});
        if(r==-1)
        {
            return false;
        }
        else
            return true;

    }

}

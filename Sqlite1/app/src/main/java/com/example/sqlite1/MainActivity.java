package com.example.sqlite1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText id,pwd;
    TextView tv;
    Button save,load,update,delete;
    DatabaseCon dbc;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=findViewById(R.id.editTextTextPersonName);
        pwd=findViewById(R.id.editTextTextPersonName2);
        save=findViewById(R.id.button);
        load=findViewById(R.id.button2);
        update=findViewById(R.id.button3);
        delete=findViewById(R.id.button4);
        tv=findViewById(R.id.textView3);
        dbc=new DatabaseCon(this);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean result=dbc.insert(id.getText().toString(),pwd.getText().toString());
                if(result==true)
                {
                    Toast.makeText(getApplicationContext(),"data inserted",Toast.LENGTH_LONG).show();
                }
             else
                {
                    Toast.makeText(getApplicationContext(),"data not inserted",Toast.LENGTH_LONG).show();
                }
            }
        });
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor result=dbc.getData();
                if(result.getCount()==0)
                    return ;
                StringBuilder sb=new StringBuilder();

                while(result.moveToNext())
                {
                    sb.append("User ID"+result.getString(0)+"\n");
                    sb.append("Password"+result.getString(1)+"\n");
                }
                tv.setText(sb);
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbc.update();
                Toast.makeText(getApplicationContext(), "data updated", Toast.LENGTH_LONG).show();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbc.delete();
                Toast.makeText(getApplicationContext(), "data deleted", Toast.LENGTH_LONG).show();

            }
        });
    }
}



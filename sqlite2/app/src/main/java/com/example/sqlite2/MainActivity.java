package com.example.sqlite2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DataBaseConnect dbc;
    EditText sid,sname,su;
    TextView tv;
    Button insert,display,update,delete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbc=new DataBaseConnect(this);

        sid=findViewById(R.id.editText);
        sname=findViewById(R.id.editText2);
        su=findViewById(R.id.editText3);
        insert=findViewById(R.id.button);
        display=findViewById(R.id.button2);
        update=findViewById(R.id.button5);
        delete=findViewById(R.id.button6);
        tv=findViewById(R.id.textView2);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean r=dbc.insertt(sid.getText().toString(),sname.getText().toString(),su.getText().toString());
                if(r==true)
                {
                    Toast.makeText(getApplicationContext(),"data inserted", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getApplicationContext(),"data not inserted", Toast.LENGTH_LONG).show();
            }
        });

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor=dbc.display();
                if(cursor.getCount()==0)
                    Toast.makeText(getApplicationContext(),"data not retrieved", Toast.LENGTH_LONG).show();
                else
                {
                    StringBuilder sb=new StringBuilder();
                    while(cursor.moveToNext())
                    {
                        sb.append("student id:"+cursor.getString(0)+"\t");
                        sb.append("student name:"+cursor.getString(1)+"\t");
                        sb.append("University:"+cursor.getString(2)+"\n");

                    }
                    tv.setText(sb.toString());

                }
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=sid.getText().toString();
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_LONG).show();
                boolean re=dbc.deletee(s1);
                if(re==true)
                    Toast.makeText(getApplicationContext(),"data delete", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"data not deleted", Toast.LENGTH_LONG).show();

            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean r=dbc.updatee(sid.getText().toString(),sname.getText().toString(),su.getText().toString());
                if(r==true)
                    Toast.makeText(getApplicationContext(),"data updated", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"data not updated", Toast.LENGTH_LONG).show();

            }
        });
    }
}

package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1,b2,b3;
    private String shname="tanooj";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editTextTextPersonName);
        et2=findViewById(R.id.editTextTextPersonName2);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        final SharedPreferences sharedPreferences=getSharedPreferences(shname,MODE_PRIVATE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor speditor=sharedPreferences.edit();
                speditor.putString("firstname",et1.getText().toString());
                speditor.putString("secondname",et2.getText().toString());
                speditor.apply();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
                et2.setText("");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(sharedPreferences.getString("firstname",""));
                et2.setText(sharedPreferences.getString("secondname",""));
                Toast.makeText(getBaseContext(),(et2.getText().toString()+et1.getText()),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
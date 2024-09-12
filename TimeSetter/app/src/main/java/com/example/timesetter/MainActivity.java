package com.example.timesetter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
private EditText et1,et2,et3;
private Button b1,b2,b3,sub;
private TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.editTextTextPersonName);
        et2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        et3 = (EditText) findViewById(R.id.editTextTextPersonName3);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        sub = (Button) findViewById(R.id.button4);
        timePicker = (TimePicker) findViewById(R.id.tp);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             et1.setText(timePicker.getHour()+" : "+timePicker.getMinute());
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(timePicker.getHour()+" : "+timePicker.getMinute());
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et3.setText(timePicker.getHour()+" : "+timePicker.getMinute());
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),MainActivity2.class);
                i.putExtra("et1",et1.getText().toString());
                i.putExtra("et2",et2.getText().toString());
                i.putExtra("et3",et3.getText().toString());
                startActivity(i);

            }
        });
    }
}
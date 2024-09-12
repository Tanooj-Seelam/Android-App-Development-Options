package com.example.currencycharges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText p1;
private EditText p2;
private Button b1;
private Button b2;
private Button b3;
private Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1 =(EditText) findViewById(R.id.editTextTextPersonName);
        p2 =(EditText) findViewById(R.id.editTextTextPersonName3);
        b1 =(Button) findViewById(R.id.button);
        b2 =(Button) findViewById(R.id.button2);
        b3 =(Button) findViewById(R.id.button3);
        b4 =(Button) findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            double ant = Double.parseDouble(p1.getText().toString());
            double ans = ant*0.014;
            p2.setText(String.valueOf(ans));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double an = Double.parseDouble(p1.getText().toString());
                double an2 = an*0.011;
                p2.setText(String.valueOf(an2));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ane = Double.parseDouble(p1.getText().toString());
                double ans1 = ane*0.018;
                p2.setText(String.valueOf(ans1));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double anf = Double.parseDouble(p1.getText().toString());
                double ans2 = anf*1.21;
                p2.setText(String.valueOf(ans2));
            }
        });
    }
}
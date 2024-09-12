package com.example.timesetter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1 = (TextView) findViewById(R.id.textView9);
        tv2 = (TextView) findViewById(R.id.textView10);
        tv3 = (TextView) findViewById(R.id.textView11);

        Intent r = getIntent();

        tv1.setText(r.getStringExtra("et1"));
        tv2.setText(r.getStringExtra("et2"));
        tv3.setText(r.getStringExtra("et3"));
    }
}
package com.example.custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView name,disc,price;
    private ImageView iv1;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = (TextView) findViewById(R.id.textView5);
        disc = (TextView) findViewById(R.id.textView6);
        price = (TextView) findViewById(R.id.textView7);
        iv1 = (ImageView) findViewById(R.id.imageView2);
        b1 = (Button) findViewById(R.id.button);
        Intent i = getIntent();
        name.setText(i.getStringExtra("names"));
        disc.setText(i.getStringExtra("disc"));
        price.setText(i.getStringExtra("cost"));
        iv1.setImageResource(i.getIntExtra("image",0));
    }
}
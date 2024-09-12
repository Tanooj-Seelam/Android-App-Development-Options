package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
   private TextView name,disc,price;
   private ImageView iv1;
   private Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = (TextView) findViewById(R.id.textView);
        disc = (TextView) findViewById(R.id.textView2);
        price = (TextView) findViewById(R.id.textView3);
        iv1 = (ImageView) findViewById(R.id.imageView2);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button3);
        Intent i = getIntent();
        name.setText(i.getStringExtra("name"));
        disc.setText(i.getStringExtra("disc"));
        price.setText(i.getStringExtra("price"));
        iv1.setImageResource(i.getIntExtra("image",0));
    }
}
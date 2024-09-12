package com.example.listviewcustom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

class shopProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_product);
        Intent i = getIntent();
        String name = i.getStringExtra("Name");
        String desc = i.getStringExtra("Desc");
        int fruits = i.getIntExtra("Fruits",R.drawable.smily);
        ImageView imageView = findViewById(R.id.imageView2);
        TextView t1 = findViewById(R.id.textView3);
        TextView t2 = findViewById(R.id.textView4);
        imageView.setImageResource(fruits);
        t1.setText(name);
        t2.setText(desc);
    }
}
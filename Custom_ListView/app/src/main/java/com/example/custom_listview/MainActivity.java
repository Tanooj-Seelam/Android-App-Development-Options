package com.example.custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] productNames = {"Lamborghini Aventador", "Lamborghini Huracán", "Lamborghini Urus", "Lamborghini Sián", "Lamborghini Terzo Millennio", "Lamborghini Asterion", "Lamborghini Estoque", "Lamborghini Aventador S Roadster"};
    String discription = "LAMBORGHINI WORLD";
    String[] costs = {"5.01 CR", "3.22 CR", "3.10 CR", "27 CR", "32 CR", "29 CR", " 30 CR", "5 CR"};
    int[] images = {R.drawable.i1, R.drawable.i2, R.drawable.i3, R.drawable.i4, R.drawable.i5, R.drawable.i6, R.drawable.i7, R.drawable.i8};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);

        MainAdapter adapter = new MainAdapter(MainActivity.this,productNames,discription,costs,images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("image",images[position]);
                intent.putExtra("names",productNames[position]);
                intent.putExtra("disc",discription);
                intent.putExtra("cost",costs[position]);
                startActivity(intent);
            }
        });
    }
}
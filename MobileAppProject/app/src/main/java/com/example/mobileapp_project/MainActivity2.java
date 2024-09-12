package com.example.mobileapp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    String[] productNames = {"Play List Song 1", "Play List Song 2", "Play List Song 3", "Play List Song 4",
                            "Play List Song 5", "Play List Song 6", "Play List Song 7", "Play List Song 8",
                            "Play List Song 9", "Play List Song 10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = (ListView) findViewById(R.id.list_view);
        Intent i = getIntent();
        int image =i.getIntExtra("image",0);
        MainAdapter adapter = new MainAdapter(MainActivity2.this,productNames,image);
        listView.setAdapter(adapter);
    }
}
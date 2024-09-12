package com.example.mailrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(new mailAdapter(getData()));
    }

    private ArrayList<object_data> getData() {
        ArrayList<object_data> mailList = new ArrayList<>();
        mailList.add(new object_data("Hey, I just met you....","Hey, I just met you....", "Hey, I just met you ....",R.drawable.q1));
        mailList.add(new object_data("Hey, I just met you....","Hey, I just met you....", "Hey, I just met you ....",R.drawable.q2));
        mailList.add(new object_data("Hey, I just met you....","Hey, I just met you....", "Hey, I just met you ....",R.drawable.q3));
        mailList.add(new object_data("Hey, I just met you....","Hey, I just met you....", "Hey, I just met you ....",R.drawable.q1));
        mailList.add(new object_data("Hey, I just met you....","Hey, I just met you....", "Hey, I just met you ....",R.drawable.q2));
        mailList.add(new object_data("Hey, I just met you....","Hey, I just met you....", "Hey, I just met you ....",R.drawable.q3));
        mailList.add(new object_data("Hey, I just met you....","Hey, I just met you....", "Hey, I just met you ....",R.drawable.q1));
        mailList.add(new object_data("Hey, I just met you....","Hey, I just met you....", "Hey, I just met you ....",R.drawable.q2));
        mailList.add(new object_data("Hey, I just met you....","Hey, I just met you....", "Hey, I just met you ....",R.drawable.q3));
        return mailList;
    }
}
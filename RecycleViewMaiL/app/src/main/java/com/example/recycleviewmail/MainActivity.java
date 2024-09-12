package com.example.recycleviewmail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.LimitExceededException;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecylerView();
    }

    private void initData() {

        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.i1,"Tanooj Seelam","Assignnment","18BCE7281 assignment","10:45 PM"));
        userList.add(new ModelClass(R.drawable.i2,"Palguni","Cyber","Material Chudu","1:00 PM"));
        userList.add(new ModelClass(R.drawable.i3,"Sahithi","Crypto","Class Ladhu anta","12:45 PM"));
        userList.add(new ModelClass(R.drawable.i4,"Mounika","Oppo A7","New Phone Link","12:35 PM"));
        userList.add(new ModelClass(R.drawable.i5,"Arshitha","Ph akada?","Phone akada pasdasav","10:55 AM"));
        userList.add(new ModelClass(R.drawable.i6,"Girish","Game Adudham","Babai game adudham rara","9:30 AM"));
        userList.add(new ModelClass(R.drawable.i7,"Doradala","Reply Evala","Sir ki mail chasa reply rala","8:15 AM"));
    }

    private void initRecylerView() {
        recyclerView = findViewById(R.id.recycleView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}

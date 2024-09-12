package com.example.contextualmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    RelativeLayout relativeLayout;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        relativeLayout = (RelativeLayout) findViewById(R.id.RelativeLayout);
        registerForContextMenu(imageView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose a Color");
        menu.add(0,v.getId(),0,"Blue");
        menu.add(0,v.getId(),0,"White");
        menu.add(0,v.getId(),0,"Green");
        // MenuInflater inflator = getMenuInflater();
        // inflator.inflater(R.menu.menu_item,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getTitle() == "Blue") {
            relativeLayout.setBackgroundColor(Color.BLUE);
        }
        if(item.getTitle() == "White") {
            relativeLayout.setBackgroundColor(Color.WHITE);
        }
        if(item.getTitle() == "Green") {
            relativeLayout.setBackgroundColor(Color.GREEN);
        }
        return true;
    }
}
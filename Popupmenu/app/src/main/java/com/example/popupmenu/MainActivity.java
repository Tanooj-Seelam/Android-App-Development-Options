package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener) MainActivity.this);
                popup.inflate(R.menu.menu_items);
                popup.show();
            }
        });
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        Toast.makeText(this,"Selected Item: " +item.getTitle(),Toast.LENGTH_SHORT).show();
        switch (item.getItemId())
        {
            case R.id.search_item:
                Toast.makeText(this,"Selected Item: " +item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.upload_item:
                Toast.makeText(this,"Selected Item: " +item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.copy_item:
                Toast.makeText(this,"Selected Item: " +item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.print_item:
                Toast.makeText(this,"Selected Item: " +item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share_item:
                Toast.makeText(this,"Selected Item: " +item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.bookmark_item:
                Toast.makeText(this,"Selected Item: " +item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}
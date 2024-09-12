package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import java.nio.channels.GatheringByteChannel;

public class MainActivity extends AppCompatActivity {
    int[] images = {R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8};
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gallery gallery = findViewById(R.id.gallery);
        gallery.setAdapter(new myAdapter(this));
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                iv = (ImageView) findViewById(R.id.imageView);
                iv.setImageResource(images[position]);
            }
        });
    }

    private class myAdapter extends BaseAdapter {
        Context c;
        public myAdapter(MainActivity mainActivity)
        {
            c = mainActivity;
        }

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = LayoutInflater.from(c).inflate(R.layout.imageview,parent,false);
            ImageView img = (ImageView) findViewById(R.id.imageView2);
            img.setImageResource(images[position]);
            return view;
        }
    }
}
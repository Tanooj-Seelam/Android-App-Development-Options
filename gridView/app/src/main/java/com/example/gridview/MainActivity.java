package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String[] productNames = {"Lamborghini Aventador","Lamborghini Huracán","Lamborghini Urus","Lamborghini Sián","Lamborghini Terzo Millennio", "Lamborghini Asterion","Lamborghini Estoque","Lamborghini Aventador S Roadster"};
    String discription = "LAMBORGHINI WORLD";
    String[] costs = {"5.01 CR","3.22 CR","3.10 CR","27 CR","32 CR","29 CR"," 30 CR","5 CR"};
    int[] images = {R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView =(GridView)findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("name",productNames[position]);
                intent.putExtra("disc",discription);
                intent.putExtra("price",costs[position]);
                intent.putExtra("image",images[position]);
                startActivity(intent);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {

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
            View view1 = getLayoutInflater().inflate(R.layout.data,null);
            TextView name = view1.findViewById(R.id.textview7);
            TextView disc = view1.findViewById(R.id.textview6);
            TextView cost = view1.findViewById(R.id.textview5);
            ImageView image = view1.findViewById(R.id.imageView);
            name.setText(productNames[position]);
            disc.setText(discription);
            cost.setText(costs[position]);
            image.setImageResource(images[position]);
            return view1;
        }
    }
}
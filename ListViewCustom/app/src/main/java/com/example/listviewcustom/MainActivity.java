package com.example.listviewcustom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static int fruits[] = {R.drawable.apple, R.drawable.banana, R.drawable.grapes, R.drawable.kivi, R.drawable.orange};
    static String names[] = {"Apple", "Banana", "Grapes", "Kiwi", "Orange"};
    static String desc[] = {"Apple Varieties", "banana Varieties", "Grapes Varieties", "Kiwi Varieties", "Orange Varieties"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.ListView);
        listView.setAdapter(new Myadapter(this));
    }

    private class Myadapter extends BaseAdapter {
        Context c;
        public Myadapter(MainActivity mainActivity) {
            c = mainActivity;
        }

        @Override
        public int getCount() {
            return fruits.length;
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
            View view = LayoutInflater.from(c).inflate(R.layout.items,parent, false);
            TextView t1 = view.findViewById(R.id.textView);
            t1.setText(names[position]);
            TextView t2 = view.findViewById(R.id.textView2);
            t2.setText(desc[position]);
            Button b = view.findViewById(R.id.button);
            ImageView imageView = view.findViewById(R.id.imageView);
            imageView.setImageResource(fruits[position]);
            b.setOnClickListener(new View.OnClickListener() {
                class shop_product {
                }

                @Override
                public void onClick(View V) {
                    Intent i = new Intent(getApplicationContext(),shop_product.class);
                    i.putExtra("Fruits",fruits[position]);
                    i.putExtra("Name",names[position]);
                    i.putExtra("Desc",desc[position]);
                    startActivity(i);
                }
            });
            return view;
        }
    }
}

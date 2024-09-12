package com.example.alertdialoguechocetype1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    Button b1;
    String names[]={"Apple","Banana","Grapes","Kivi","Orange"};
    int images[]={R.drawable.apple,R.drawable.banana,R.drawable.grapes,R.drawable.kivi,R.drawable.orange};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextTextPersonName);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setIcon(R.drawable.ic_launcher_foreground);
                builder.setTitle("Multi Choice Items");
                builder.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                builder.setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });


                ListView lv=new ListView(MainActivity.this);
                lv.setAdapter(new MyAdapter(MainActivity.this));
                builder.setView(lv);

                builder.create().show();
            }

        });
    }

    private class MyAdapter extends BaseAdapter {
        Context mycontext;
        public MyAdapter(MainActivity mainActivity) {
            mycontext=mainActivity;
        }

        @Override
        public int getCount() {
            return names.length;
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
            View view= LayoutInflater.from(mycontext).inflate(R.layout.itemlayout,parent,false);
            TextView tv=view.findViewById(R.id.textView);
            ImageView im=view.findViewById(R.id.imageView);
            tv.setText(names[position]);
            im.setImageResource(images[position]);
            return view;
        }
    }
}
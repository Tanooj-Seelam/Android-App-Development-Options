package com.example.floatingaction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
    int i=0,j=0,k=0,l=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1 = (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        f2 = (FloatingActionButton) findViewById(R.id.floatingActionButton3);
        f3 = (FloatingActionButton) findViewById(R.id.floatingActionButton4);
        f4 = (FloatingActionButton) findViewById(R.id.floatingActionButton5);
        f5 = (FloatingActionButton) findViewById(R.id.floatingActionButton6);
        f6 = (FloatingActionButton) findViewById(R.id.floatingActionButton7);
        f7 = (FloatingActionButton) findViewById(R.id.floatingActionButton8);
        f8 = (FloatingActionButton) findViewById(R.id.floatingActionButton9);
        f9 = (FloatingActionButton) findViewById(R.id.floatingActionButton10);
        f10 = (FloatingActionButton) findViewById(R.id.floatingActionButton);

        f1.setVisibility(View.INVISIBLE);
        f2.setVisibility(View.INVISIBLE);
        f3.setVisibility(View.INVISIBLE);
        f4.setVisibility(View.INVISIBLE);
        f5.setVisibility(View.INVISIBLE);
        f6.setVisibility(View.INVISIBLE);
        f7.setVisibility(View.INVISIBLE);
        f8.setVisibility(View.INVISIBLE);
        f10.setVisibility(View.INVISIBLE);


        f9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0)
                {
                    f1.setVisibility(View.VISIBLE);
                    f2.setVisibility(View.VISIBLE);
                    f3.setVisibility(View.VISIBLE);
                    i++;
                }
                else{
                    f1.setVisibility(View.INVISIBLE);
                    f2.setVisibility(View.INVISIBLE);
                    f3.setVisibility(View.INVISIBLE);
                    f4.setVisibility(View.INVISIBLE);
                    f5.setVisibility(View.INVISIBLE);
                    f6.setVisibility(View.INVISIBLE);
                    f7.setVisibility(View.INVISIBLE);
                    f8.setVisibility(View.INVISIBLE);
                    f10.setVisibility(View.INVISIBLE);
                    i=0;
                }

            }
        });

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(j==0)
                {
                    f5.setVisibility(View.VISIBLE);
                    f6.setVisibility(View.VISIBLE);
                    j++;
                }
                else{
                    f4.setVisibility(View.INVISIBLE);
                    f5.setVisibility(View.INVISIBLE);
                    f6.setVisibility(View.INVISIBLE);
                    f7.setVisibility(View.INVISIBLE);
                    f8.setVisibility(View.INVISIBLE);
                    f10.setVisibility(View.INVISIBLE);
                    j=0;
                }

            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k==0)
                {
                    f10.setVisibility(View.VISIBLE);
                    f7.setVisibility(View.VISIBLE);
                    k++;
                }
                else{
                    f4.setVisibility(View.INVISIBLE);
                    f7.setVisibility(View.INVISIBLE);
                    f8.setVisibility(View.INVISIBLE);
                    f10.setVisibility(View.INVISIBLE);
                    k=0;
                }

            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(l==0)
                {
                    f4.setVisibility(View.VISIBLE);
                    f8.setVisibility(View.VISIBLE);
                    l++;
                }
                else{
                    f4.setVisibility(View.INVISIBLE);
                    f8.setVisibility(View.INVISIBLE);
                    l=0;
                }

            }
        });
    }
}
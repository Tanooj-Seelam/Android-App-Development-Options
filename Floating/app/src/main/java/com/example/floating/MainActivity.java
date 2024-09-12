package com.example.floating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
FloatingActionButton f1,f2,f3;
int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1 = (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        f2 = (FloatingActionButton) findViewById(R.id.floatingActionButton3);
        f3 = (FloatingActionButton) findViewById(R.id.floatingActionButton4);

        f2.setVisibility(View.INVISIBLE);
        f3.setVisibility(View.INVISIBLE);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0)
                {
                    f2.setVisibility(View.VISIBLE);
                    f3.setVisibility(View.VISIBLE);
                    i++;
                }
                else{
                    f2.setVisibility(View.INVISIBLE);
                    f3.setVisibility(View.INVISIBLE);
                    i=0;
                }

            }
        });
    }
}
package com.example.playcards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText ed1,ed2,ed3,ed4,ed5,ed6;
    private Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.editTextTextPersonName);
        ed2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        ed3 = (EditText) findViewById(R.id.editTextTextPersonName3);
        ed4 = (EditText) findViewById(R.id.editTextTextPersonName4);
        ed5 = (EditText) findViewById(R.id.editTextTextPersonName5);
        ed6 = (EditText) findViewById(R.id.editTextTextPersonName6);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int i = r.nextInt(9) +1;
                ed1.setText(Integer.toString(i));
                int j = r.nextInt(9) +1;
                ed2.setText(Integer.toString(j));
                int k = r.nextInt(9) +1;
                ed3.setText(Integer.toString(k));
                int l = r.nextInt(9) +1;
                ed4.setText(Integer.toString(l));
                int m = r.nextInt(9) +1;
                ed5.setText(Integer.toString(m));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(ed1.getText().toString());
                int b = Integer.parseInt(ed2.getText().toString());
                int c = Integer.parseInt(ed3.getText().toString());
                int d = Integer.parseInt(ed4.getText().toString());
                int e = Integer.parseInt(ed5.getText().toString());
                int temp=0;
                for (int count = 0; count < 4; count++)
                {
                    if ( b < a)
                    {
                        temp = a;
                        a = b;
                        b = temp;
                    }

                    if ( c < b)
                    {
                        temp = b;
                        b = c;
                        c = temp;
                    }

                    if ( d < c)
                    {
                        temp = c;
                        c = d;
                        d = temp;
                    }

                    if ( e < d)
                    {
                        temp = d;
                        d = e;
                        e = temp;
                    }
                }

                ed1.setText(Integer.toString(a));
                ed2.setText(Integer.toString(b));
                ed3.setText(Integer.toString(c));
                ed4.setText(Integer.toString(d));
                ed5.setText(Integer.toString(e));

                int sum = a+b+c+d+e;
                ed6.setText(Integer.toString(sum));
            }
        });
    }
}
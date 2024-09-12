package com.example.iotstore;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
private EditText n1;
private EditText n2;
private EditText n3;
private EditText n4;
private Button b1;
private Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText) findViewById(R.id.editTextTextPersonName);
        n2=(EditText) findViewById(R.id.editTextTextPersonName2);
        n3=(EditText) findViewById(R.id.editTextTextPersonName3);
        n4=(EditText) findViewById(R.id.editTextTextPersonName4);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int t = Integer.parseInt(n1.getText().toString());
                int f = Integer.parseInt(n2.getText().toString());
                int e = Integer.parseInt(n3.getText().toString());
                int ans = t*500+f*250+e*200;
                n4.setText(""+String.valueOf(ans));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1.setText("");
                n2.setText("");
                n3.setText("");
                n4.setText("");
            }
        });
    }
}
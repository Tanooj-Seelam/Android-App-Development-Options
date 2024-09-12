package com.example.displayname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editTextTextPersonName;
Button button;
TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName=(EditText)findViewById(R.id.editTextTextPersonName);
        button=(Button)findViewById(R.id.button);
        textView3=(TextView)findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextTextPersonName.getText().toString();
                textView3.setText(" Welcome "+name);
            }
        });
    }
}
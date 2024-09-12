package com.example.intentexample;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
protected TextView textView;
protected EditText editText1,editText2;
protected Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView5);
        editText1 = (EditText)findViewById(R.id.editTextTextPersonName);
        editText2 = (EditText)findViewById(R.id.editTextTextPersonName2);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(editText1.getText().toString());
                double b =  Double.parseDouble(editText2.getText().toString());
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("Number1",a);
                i.putExtra("Number2",b);
                startActivityForResult(i,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode ==1)
        {
            if(resultCode == RESULT_OK)
            {
                double result = data.getIntExtra("ANS",0);
                textView.setText((int) result);
            }
        }
    }
}
package com.example.mathematicaloperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText number1;
private EditText number2;
private Button add;
private Button subtract;
private Button multiply;
private Button divide;
private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1=(EditText) findViewById(R.id.editTextTextPersonName);
        number2=(EditText) findViewById(R.id.editTextTextPersonName2);
        add=(Button) findViewById(R.id.button);
        subtract=(Button) findViewById(R.id.button2);
        multiply=(Button) findViewById(R.id.button3);
        divide=(Button) findViewById(R.id.button4);
        answer=(TextView) findViewById(R.id.textView2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());
                int sum = n+n2;
                answer.setText("Addition Answer = "+String.valueOf(sum));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());
                int sub = n-n2;
                answer.setText("Subtraction Answer = "+String.valueOf(sub));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());
                int multi = n*n2;
                answer.setText("Multiplication Answer = "+String.valueOf(multi));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double n = Double.parseDouble(number1.getText().toString());
                Double n2 = Double.parseDouble(number2.getText().toString());
                Double div = n/n2;
                answer.setText("Division Answer = "+String.valueOf(div));
            }
        });
    }
}
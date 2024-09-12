package com.example.buttonsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioButton rb1;
    private RadioGroup rg;
    private CheckBox cb1,cb2,cb3,cb4;
    private Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup) findViewById(R.id.RadioGroup);
        cb1=(CheckBox) findViewById(R.id.checkBox3);
        cb2=(CheckBox) findViewById(R.id.checkBox2);
        cb3=(CheckBox) findViewById(R.id.checkBox);
        cb4=(CheckBox) findViewById(R.id.checkBox4);
        b1=(Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = rg.getCheckedRadioButtonId();
                rb1=(RadioButton) findViewById(i);
                Toast.makeText(getApplicationContext(),rb1.getText(),Toast.LENGTH_LONG).show();

                if (cb1.isChecked())
                {
                    Toast.makeText(getApplicationContext(),cb1.getText(),Toast.LENGTH_LONG).show();
                }
                if (cb2.isChecked())
                {
                    Toast.makeText(getApplicationContext(),cb2.getText(),Toast.LENGTH_LONG).show();
                }
                if (cb3.isChecked())
                {
                    Toast.makeText(getApplicationContext(),cb3.getText(),Toast.LENGTH_LONG).show();
                }
                if (cb4.isChecked())
                {
                    Toast.makeText(getApplicationContext(),cb4.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
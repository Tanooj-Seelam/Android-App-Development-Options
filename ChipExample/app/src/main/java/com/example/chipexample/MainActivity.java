package com.example.chipexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ChipGroup cg;
private Chip ch,c;
private Button b1,b2;
int no=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cg=(ChipGroup) findViewById(R.id.chipGroup);
                List<Integer> arr = cg.getCheckedChipIds();
                for (int i=0;i<arr.size();i++)
                {
                    ch =(Chip) findViewById(arr.get(i));
                    if (ch.isChecked())
                    {
                        Toast.makeText(getApplicationContext(),ch.getText(),Toast.LENGTH_LONG).show();
                    }
                    ch.setOnCloseIconClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cg.removeView(ch);
                        }
                    });
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c = new Chip(MainActivity.this);
                c.setText("Chip"+String.valueOf(no++));
                c.setCheckable(true);
                c.setChipIcon(getDrawable(R.drawable.flower));
                c.setCheckedIcon(getDrawable(R.drawable.close));
                cg.addView(c);
            }
        });
    }
}
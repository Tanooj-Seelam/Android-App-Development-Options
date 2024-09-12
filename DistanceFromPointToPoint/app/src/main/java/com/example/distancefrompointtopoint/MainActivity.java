package com.example.distancefrompointtopoint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2,et3,et4,et5,et6;
    private ImageButton ib;
    private ChipGroup cg;
    private Chip c;
    int cc,cb,ct,cw;
    int prv=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.editTextTextPersonName);
        et2=(EditText) findViewById(R.id.editTextTextPersonName2);
        et3=(EditText) findViewById(R.id.editTextTextPersonName3);
        et4=(EditText) findViewById(R.id.editTextTextPersonName6);
        et5=(EditText) findViewById(R.id.editTextTextPersonName5);
        et6=(EditText) findViewById(R.id.editTextTextPersonName4);
        ib=(ImageButton) findViewById(R.id.imageButton2);
        cg=(ChipGroup) findViewById(R.id.chipgroup);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp,a,b;
                a = et1.getText().toString();
                b = et2.getText().toString();
                temp=a;
                a=b;
                b=temp;
                et1.setText(a);
                et2.setText(b);

            }
        });

        cc = R.id.chip4;
        cb = R.id.chip5;
        ct = R.id.chip6;
        cw = R.id.chip7;

        et3.setVisibility(View.INVISIBLE);
        et4.setVisibility(View.INVISIBLE);
        et5.setVisibility(View.INVISIBLE);
        et6.setVisibility(View.INVISIBLE);

        cg.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                if(prv!=0){
                    if(prv == cc){
                        et3.setVisibility(View.INVISIBLE);
                    }
                    if(prv == cb){
                        et4.setVisibility(View.INVISIBLE);
                    }
                    if(prv == ct){
                        et5.setVisibility(View.INVISIBLE);
                    }
                    if(prv == cw){
                        et6.setVisibility(View.INVISIBLE);
                    }
                }
                if (checkedId == cc) {
                    et3.setVisibility(View.VISIBLE);
                }
                if (checkedId == cb) {
                    et4.setVisibility(View.VISIBLE);
                }
                if (checkedId == ct) {
                   et5.setVisibility(View.VISIBLE);
                }
                if (checkedId == cw) {
                   et6.setVisibility(View.VISIBLE);
                }
                   prv = checkedId;
            }
        });

    }
}

package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bp, bmi, bm, bd, be, bc;
    private TextView txt;
    private Double res1,res2;
    private boolean Add,Subtract,Multiply,Divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button5);
        Button b4 = (Button) findViewById(R.id.button9);
        Button b5 = (Button) findViewById(R.id.button6);
        Button b6 = (Button) findViewById(R.id.button10);
        Button b7 = (Button) findViewById(R.id.button7);
        Button b8 = (Button) findViewById(R.id.button11);
        Button b9 = (Button) findViewById(R.id.button8);
        Button b0 = (Button) findViewById(R.id.button12);
        Button bp = (Button) findViewById(R.id.button3);
        Button bmi = (Button) findViewById(R.id.button13);
        Button bm = (Button) findViewById(R.id.button14);
        Button bd = (Button) findViewById(R.id.button16);
        Button be = (Button) findViewById(R.id.button17);
        Button bc = (Button) findViewById(R.id.button18);
        TextView txt = (TextView) findViewById(R.id.editTextTextPersonName);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "0");
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(txt==null) {
                   txt.setText("");
               }
                else {
                     res1=Double.parseDouble(txt.getText()+"");
                     Add=true;
                     txt.setText(null);
               }
            }
        });

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt==null) {
                    txt.setText("");
                }
                else {
                    res1=Double.parseDouble(txt.getText()+"");
                    Subtract=true;
                    txt.setText(null);
                }
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt==null) {
                    txt.setText("");
                }
                else {
                    res1=Double.parseDouble(txt.getText()+"");
                    Multiply=true;
                    txt.setText(null);
                }
            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt==null) {
                    txt.setText("");
                }
                else {
                    res1=Double.parseDouble(txt.getText()+"");
                    Divide=true;
                    txt.setText(null);
                }
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    txt.setText("");
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2 = Double.parseDouble(txt.getText()+"");
                if(Add==true) {
                    txt.setText(res1+res2+"");
                    Add=false;
                }
                if(Subtract==true) {
                    txt.setText(res1-res2+"");
                    Subtract=false;
                }
                if(Multiply==true) {
                    txt.setText(res1*res2+"");
                    Multiply=false;
                }
                if(Divide==true) {
                    txt.setText(res1/res2+"");
                    Divide=false;
                }
            }
        });
    }
}
package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rg;
    private RadioButton rb1,rb2,rb3;
    private Button bt;
    private TextView tv;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup) findViewById(R.id.radioGroup);
        tv=(TextView) findViewById(R.id.editTextTextPersonName);
        tv1=(TextView) findViewById(R.id.textView2);
        bt=(Button) findViewById(R.id.button);
        rb1=(RadioButton) findViewById(R.id.radioButton3);
        rb2=(RadioButton) findViewById(R.id.radioButton);
        rb3=(RadioButton) findViewById(R.id.radioButton2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (rb1.isChecked())
                {
                    double ant = Double.parseDouble(tv.getText().toString());
                    double ans = ant*0.0140;
                    tv1.setText("The Amount is equal to "+String.valueOf(ans)+"$");
                }
               if (rb2.isChecked())
               {
                   double ant = Double.parseDouble(tv.getText().toString());
                   double ans = ant*0.0110;
                   tv1.setText("The Amount is equal to "+String.valueOf(ans)+"€");
               }
               if (rb3.isChecked())
               {
                   double ant = Double.parseDouble(tv.getText().toString());
                   double ans = ant*1.440;
                   tv1.setText("The Amount is equal to "+String.valueOf(ans)+"¥");
               }
            }
        });
    }
}
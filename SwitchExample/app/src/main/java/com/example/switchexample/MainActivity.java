package com.example.switchexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SwitchCompat sc;
    private TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sc=(SwitchCompat) findViewById(R.id.switch1);
        tw=(TextView) findViewById(R.id.textView);

        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sc.isChecked())
                {
                    tw.setText("Switch Is On");
                }
                else{
                    tw.setText("Switch is OFF");
                }
            }
        });
    }
}
package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton tb;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb=(ToggleButton) findViewById(R.id.toggle);
        tv=(TextView) findViewById(R.id.textView);

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tb.isChecked())
                {
                    tv.setText("Toggle Button ON");
                }
                else {
                    tv.setText("Toggle Button is Off");
                }
            }
        });
    }
}
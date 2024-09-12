package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.audiofx.BassBoost;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private boolean but1,but2,but3,but4;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button4);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button2);
        b5=(Button) findViewById(R.id.button5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (but2==true || but3==true || but4==true)
                {
                    stopService(i);
                    but2=false; but3=false; but4=false;
                }
                i = new Intent(getApplicationContext(), music1.class);
                startService(i);
                but1=true;
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (but1==true || but3==true || but4==true)
                {
                    stopService(i);
                    but1=false; but3=false; but4=false;
                }
                i = new Intent(getApplicationContext(), music2.class);
                startService(i);
                but2=true;
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (but1==true || but2==true || but4==true)
                {
                    stopService(i);
                    but1=false; but2=false; but4=false;
                }
                i = new Intent(getApplicationContext(), music3.class);
                startService(i);
                but3=true;
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (but1==true || but2==true || but3==true)
                {
                    stopService(i);
                    but1=false; but2=false; but3=false;
                }
                i = new Intent(getApplicationContext(), music4.class);
                startService(i);
                but4=true;
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (but1=true) {
                    stopService(i);
                    but1=false;
                }
                else if (but2=true) {
                    stopService(i);
                    but2=false;
                }
                else if (but3=true) {
                    stopService(i);
                    but3=false;
                }
                else if (but4=true) {
                    stopService(i);
                    but4=false;
                }
            }
        });
    }
}
package com.example.broadcastadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerBroadcastReceiverDynamically(v);
                onDestroy();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendUsingDynamicRegisterBroadcastReceiver(v);
                onDestroy();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendUsingStaticallyRegisterBroadcastReceiver(v);
                onDestroy();
            }
        });
    }

    ///////////////======Dynamic Broadcast Service======///////////////
    DynamicBroadcastReceiver dynamicBroadcastReceiver = new DynamicBroadcastReceiver();

    public void registerBroadcastReceiverDynamically(View View) {
        IntentFilter filter = new IntentFilter();
        filter.addAction("MY_BROADCAST");
        registerReceiver(dynamicBroadcastReceiver, filter);
    }

    public void sendUsingDynamicRegisterBroadcastReceiver(View View) {
        Intent i = new Intent();
        i.setAction("MY_BROADCAST");
        sendBroadcast(i);
    }

    @Override
    protected void onDestroy() {
        if (dynamicBroadcastReceiver != null) {
            unregisterReceiver(dynamicBroadcastReceiver);
        }
        super.onDestroy();
    }

    public void sendUsingStaticallyRegisterBroadcastReceiver(View View) {
        Intent i = new Intent();
        i.setAction("MY_BROADCAST");
        sendBroadcast(i);
    }
}
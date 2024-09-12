package com.example.custombroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(intent.ACTION_POWER_CONNECTED))
        {
            Toast.makeText(context,"Power Connected !!!",Toast.LENGTH_LONG).show();
        }

        if (intent.getAction().equals(intent.ACTION_POWER_DISCONNECTED))
        {
            Toast.makeText(context,"Power Disconnected !!!",Toast.LENGTH_LONG).show();
        }

        if (intent.getAction().equals(intent.ACTION_AIRPLANE_MODE_CHANGED))
        {
            Toast.makeText(context,"Aeroplane Mode !!!",Toast.LENGTH_LONG).show();
        }

        if (intent.getAction().equals(intent.ACTION_HEADSET_PLUG))
        {
            Toast.makeText(context,"Headset Plugged !!!",Toast.LENGTH_LONG).show();
        }

    }
}

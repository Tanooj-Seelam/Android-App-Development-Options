package com.example.musicapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.widget.Toast;

import java.net.URI;

public class music1 extends Service {
    private MediaPlayer mp;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent,int flags,int startId) {
        mp=MediaPlayer.create(this, R.raw.song1);
        mp.setLooping(true);
        mp.start();
        return START_STICKY;
    }

    public void onDestroy() {
        Toast.makeText(this, "Service Stopped and Music Stopped", Toast.LENGTH_SHORT).show();
        mp.stop();
        super.onDestroy();

    }
}
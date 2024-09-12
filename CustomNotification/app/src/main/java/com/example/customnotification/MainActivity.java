package com.example.customnotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        if (Build.VERSION.SDK_INT>Build.VERSION_CODES.O)
        {
            NotificationChannel notificationChannel = new NotificationChannel("tanooj","Tanooj Seelam", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            manager.createNotificationChannel(notificationChannel);
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this,"tanooj")
                        .setContentTitle("Watsapp")
                        .setContentText("Entertainment Entertainment")
                        .setSmallIcon(R.drawable.ic_launcher_foreground);
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("message","Hellow Welcome To Notifications");
                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this,0,i,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);

                Notification notification = builder.build();
                NotificationManagerCompat manager = NotificationManagerCompat.from(MainActivity.this);
                manager.notify(0,notification);

            }
        });
    }
}
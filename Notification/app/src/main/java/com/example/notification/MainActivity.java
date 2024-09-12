package com.example.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class MainActivity extends AppCompatActivity {
    ListView lv ;
    String[] modes={"Bike","Boat","Bus","Car","Railway","Run"};

    Integer[] icons={R.drawable.ic_baseline_directions_bike_24,R.drawable.ic_baseline_directions_boat_filled_24,
                     R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_car_filled_24,
                     R.drawable.ic_baseline_directions_railway_24,R.drawable.ic_baseline_directions_run_24};
    String time[]={"Time to travel : 4hrs 40mins","Time to travel: 3hrs 50mins","Time to travel: 6hrs 5mins",
            "Time to travel: 5hrs 25mins","Time to travel:3hrs 55mins","Time to travel:1 and half day"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= findViewById(R.id.list);
        lv.setAdapter(new MyListAdapter(this));
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel=new NotificationChannel("Travel Around","travel", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            manager.createNotificationChannel(notificationChannel);
        }
    }
    private class MyListAdapter extends BaseAdapter {
        Context context;
        public MyListAdapter(MainActivity mainActivity) {
            context=mainActivity;
        }
        @Override
        public int getCount() {
            return modes.length;
        }
        @Override
        public Object getItem(int position) {
            return null;
        }
        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view= LayoutInflater.from(context).inflate(R.layout.layout_1,parent,false);
            ImageView iv=view.findViewById(R.id.img);
            TextView tv=view.findViewById(R.id.textView2);
            iv.setImageResource(icons[position]);
            tv.setText(modes[position]);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    NotificationCompat.Builder builder=new NotificationCompat.Builder(MainActivity.this,"Travel Around");
                    builder.setContentTitle(modes[position]); builder.setContentText(time[position]);
                    builder.setSmallIcon(icons[position]);
                    builder.setLargeIcon(BitmapFactory. decodeResource (getResources() ,icons[position])) ;
                    NotificationManagerCompat manager=NotificationManagerCompat.from(MainActivity.this);
                    manager.notify(0,builder.build());
                }
            });
            return view;
        }
    }
}
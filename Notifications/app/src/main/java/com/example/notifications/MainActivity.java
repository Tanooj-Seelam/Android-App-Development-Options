package com.example.notifications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

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

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String Title[] = {"Bike","Boat","Bus","Car","Railway","Run"};
    int images[] = {R.drawable.ic_baseline_directions_bike_24,R.drawable.ic_baseline_directions_boat_filled_24,
                    R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_car_filled_24,
                    R.drawable.ic_baseline_directions_railway_24,R.drawable.ic_baseline_directions_run_24};
    String time[]={"Time To Travel : 6Hr 35Min","Time To Travel : 5Hr 55Min","Time To Travel : 5Hr 10Min",
                   "Time To Travel : 4Hr 25Min","Time To Travel : 3Hr 45Min","Time To Travel : 26Hr 55Min"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        listView.setAdapter(new MyListAdapter(this));

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O)
        {
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
            return Title.length;
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
            View view= LayoutInflater.from(context).inflate(R.layout.rows,parent,false);
            ImageView iv=view.findViewById(R.id.imageView);
            TextView tv=view.findViewById(R.id.textView1);
            iv.setImageResource(images[position]);
            tv.setText(Title[position]);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "Travel Around");
                    builder.setContentTitle(Title[position]);
                    builder.setContentText(time[position]);
                    builder.setSmallIcon(images[position]);
                    builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), images[position]));
                    NotificationManagerCompat manager = NotificationManagerCompat.from(MainActivity.this);
                    manager.notify(0, builder.build());
                }
            });
            return view;
        }
    }
}
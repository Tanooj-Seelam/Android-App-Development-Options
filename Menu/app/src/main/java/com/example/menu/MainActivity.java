package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Object Menu;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_file,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,"Selected Item :" +item.getTitle(),Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.i1:
                t1.setText(item.getTitle());
                return true;
            case R.id.a:
                t1.setText(item.getTitle());
                return true;
            case R.id.b:
                t1.setText(item.getTitle());
                return true;
            case R.id.i2:
                t1.setText(item.getTitle());
                return true;
            default:
                t1.setText(item.getTitle());
                return super.onOptionsItemSelected(item);
        }
    }
}
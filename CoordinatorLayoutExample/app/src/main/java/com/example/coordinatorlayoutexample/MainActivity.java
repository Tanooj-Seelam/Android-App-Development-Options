package com.example.coordinatorlayoutexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CoordinatorLayout f1 = findViewById(R.id.coordinator);
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(f1, "Hi how r u ?", Snackbar.LENGTH_INDEFINITE).setAction("ClEAR", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).show();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.About:
                Toast.makeText(getApplicationContext(), "About Clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.search:
                Toast.makeText(getApplicationContext(), "Search Clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.share:
                Toast.makeText(getApplicationContext(), "Share Clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Contact:
                Toast.makeText(getApplicationContext(), "Contact Clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.status:
                Toast.makeText(getApplicationContext(), "Status Clicked", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return false;
        }
    }
}
package com.example.alertmessage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button closebutton;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        closebutton = (Button) findViewById(R.id.button);
        builder = new AlertDialog.Builder(this);
        closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Welcome To Alter Message").setTitle("Alter Dialogue Example")
                .setMessage("Do You Want To Close The Application?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"You Choose Yes Action for Alert Box", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                })
                  .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(),"You Choose N0 Action for Alert Box", Toast.LENGTH_SHORT).show();
                             }
                        });
                AlertDialog alert = builder.create();
               // alert.setTitle("Alert Dialogue Example");
                alert.setIcon(R.drawable.ic_launcher_foreground);
                alert.show();
            }
        });
    }
}
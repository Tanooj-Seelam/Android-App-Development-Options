package com.example.loginpage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText Userid;
private EditText Password;
private TextView processupdate;
private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Userid = (EditText) findViewById(R.id.editTextTextPersonName);
        Password = (EditText) findViewById(R.id.editTextTextPassword);
        processupdate = (TextView) findViewById(R.id.textView2);
        login = (Button) findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((Userid.getText().toString().equals("Tanooj")) &&
                        (Password.getText().toString().equals("123456789"))) {
                    processupdate.setText(" LOGIN Successful !!!!");
                } else {
                    processupdate.setText(" LOGIN UnSuccessful !!!!");
                }
            }

        });
    }
}






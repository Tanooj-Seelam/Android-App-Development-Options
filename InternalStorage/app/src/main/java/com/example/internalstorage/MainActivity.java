package com.example.internalstorage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class MainActivity extends Activity  {
    Button b1,b2;
    TextView tv;
    EditText ed1;
    String data;
    private String file = "prabha";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        ed1=(EditText)findViewById(R.id.editTextTextPersonName);
        tv=(TextView)findViewById(R.id.textview);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=ed1.getText().toString();
                try {
                    FileOutputStream fOut = openFileOutput(file,MODE_PRIVATE);//writing data into file
                    fOut.write(data.getBytes());
                    fOut.close();
                    Toast.makeText(getBaseContext(),"file saved"+getFilesDir(),Toast.LENGTH_SHORT).show();
                }
                catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileInputStream fin = openFileInput(file);
                    int c;
                    String temp="";
                    while( (c = fin.read()) != -1)
                    //Returns: the next byte of data, or -1 if the end of the file is reached.
                    {
                        temp = temp + Character.toString((char)c);
                    }
                    tv.setText(temp);
                    Toast.makeText(getBaseContext(),"file read"+getFilesDir(),Toast.LENGTH_SHORT).show();
                }
                catch(Exception e){
                }
            }
        });
    }
}
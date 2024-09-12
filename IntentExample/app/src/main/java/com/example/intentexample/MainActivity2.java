package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Double a1 = intent.getDoubleExtra("Number1",0);
        Double a2 = intent.getDoubleExtra("Number2",0);

        Double ab = a1+a2;
        Intent result = new Intent();
        result.putExtra("ANS",ab);
        setResult(RESULT_OK,result);
        finish();
    }
}

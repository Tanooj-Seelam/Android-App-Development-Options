package com.example.imagezoominandout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
private ImageView v1, v2;
private int x1, x2;
private Animation animation1, animation2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v1 = (ImageView) findViewById(R.id.img1);
        v2 = (ImageView) findViewById(R.id.img2);
        animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.picture);
        animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.picture2);
        v1.startAnimation(animation1);
        v2.startAnimation(animation2);
    }
}

package com.example.detector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.ebanx.swipebtn.OnStateChangeListener;
import com.ebanx.swipebtn.SwipeButton;

public class splash extends AppCompatActivity {
    SwipeButton swipeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        swipeButton = findViewById(R.id.swipe_btn);
        getSupportActionBar().hide();
        swipeButton.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {
                Intent intent = new Intent(splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
package com.techrz.governmentwebsites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static final int SPLASH_TIME_OUT= 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(() -> {
            Intent homeIntent = new Intent(MainActivity.this,homeActivity.class);
            startActivity(homeIntent);
            finish();
        },SPLASH_TIME_OUT);


    }
}
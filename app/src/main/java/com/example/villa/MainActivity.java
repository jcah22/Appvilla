package com.example.villa;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import static androidx.appcompat.app.ActionBar.*;

public class MainActivity extends AppCompatActivity {

    private final int DURACION_SPLASH = 6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar  actionBar = getSupportActionBar();
        actionBar.hide();

    getSplash();

    }

    private void getSplash(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(i);
                finish();
            }
        },DURACION_SPLASH);

    }
}
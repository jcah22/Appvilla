package com.example.villa;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class argollas extends AppCompatActivity {

    ImageView diezk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argollas);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        diezk = findViewById(R.id.img10k);
        diezk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intetArgo = new Intent(getApplicationContext(),argoActivity.class);
                startActivity(intetArgo);

            }
        });
    }
}
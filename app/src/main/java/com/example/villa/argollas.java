package com.example.villa;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;

public class argollas extends AppCompatActivity {

    ImageView diezk ,catorcek;

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
                Intent intetArgo = new Intent(getApplicationContext(),EnamoroActivity.class);
                startActivity(intetArgo);

            }
        });

        catorcek = findViewById(R.id.img14k);
        catorcek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // StyleableToast.makeText(getApplicationContext(), "Argollas 14 Kilates...", Toast.LENGTH_LONG, R.style.mytoast).show();

                Toast.makeText(argollas.this, "Argollas 14 Kilates...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
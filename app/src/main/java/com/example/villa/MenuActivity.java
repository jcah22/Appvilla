package com.example.villa;

import androidx.appcompat.app.ActionBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;



public class MenuActivity extends AppCompatActivity {

    CardView card1, card2, card3, card4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.txt_titulo);


        //Toast.makeText(this, "Bienvenido a D'Villalpando", Toast.LENGTH_LONG).show();
        StyleableToast.makeText(this, " Bienvenido !", Toast.LENGTH_SHORT, R.style.mytoast).show();

        card1 = findViewById(R.id.idcard1);
        card2 = findViewById(R.id.idcard2);
        card3 = findViewById(R.id.idcard3);
        card4 = findViewById(R.id.idcard4);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEnamoro = new Intent(MenuActivity.this, EnamoroActivity.class);
                startActivity(intentEnamoro);

            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVillalpando = new Intent(MenuActivity.this,argollas.class);
                startActivity(intentVillalpando);

            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentMosha = new Intent(MenuActivity.this, EnamoroActivity.class);
                startActivity(intentMosha);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentExpos = new Intent(MenuActivity.this, ExposActivity.class);
                startActivity(intentExpos);

            }
        });


    }


}

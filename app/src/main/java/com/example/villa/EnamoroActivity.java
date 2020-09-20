package com.example.villa;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class EnamoroActivity extends AppCompatActivity {

    private RecyclerView recyclerViewEnamoro;
    private ReciclerViewAdapter adaptadorEnamoro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enamoro);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();




        recyclerViewEnamoro = findViewById(R.id.ReciclerEnamoro);
        recyclerViewEnamoro.setLayoutManager(new LinearLayoutManager(this));
        adaptadorEnamoro = new ReciclerViewAdapter(obtenerEnamro());
        recyclerViewEnamoro.setAdapter(adaptadorEnamoro);





    }

    public List<Enamoro> obtenerEnamro(){



        List<Enamoro> enamoros = new ArrayList<>();

        enamoros.add(new Enamoro("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1101));
        enamoros.add(new Enamoro("CL1108","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1108));
        enamoros.add(new Enamoro("CL1109","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1109));
        enamoros.add(new Enamoro("CL1110","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1110));

        enamoros.add(new Enamoro("CL1116","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1116));
        enamoros.add(new Enamoro("CL1200","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1200));
        enamoros.add(new Enamoro("CL1201","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1201));
        enamoros.add(new Enamoro("CL1202","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1202));
        enamoros.add(new Enamoro("CL088-61","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl088_61));


        enamoros.add(new Enamoro("CL104-61","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl104_61));
        enamoros.add(new Enamoro("CL105_61","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl105_61));
        enamoros.add(new Enamoro("CL107CO-61","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl107co_61));
        enamoros.add(new Enamoro("CL1108-41","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1108_41));
        enamoros.add(new Enamoro("CL1117","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1117));
        enamoros.add(new Enamoro("CL1118","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1118));
        enamoros.add(new Enamoro("CL1119","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1119));
        enamoros.add(new Enamoro("CL1120","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1120));
        enamoros.add(new Enamoro("CL1122","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1122));
        enamoros.add(new Enamoro("CL1123","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1123));
        enamoros.add(new Enamoro("CL1126","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1126));
        enamoros.add(new Enamoro("CL1128","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1128));
        enamoros.add(new Enamoro("CL1129","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1129));


        enamoros.add(new Enamoro("CL1131","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1131));
        enamoros.add(new Enamoro("CL1112-41","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1112_41));
        enamoros.add(new Enamoro("CL101R-41","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl101r_41));
        enamoros.add(new Enamoro("CL099R-41","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl099r_41));
        enamoros.add(new Enamoro("CL1104B","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1104b));
        enamoros.add(new Enamoro("CL1110B","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1110b));
        enamoros.add(new Enamoro("CL1112B","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1112b));
        enamoros.add(new Enamoro("CL1114B","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl1114b));
        enamoros.add(new Enamoro("CL004COCP-41","Argolla 6mm 10 Kilates","P.P: 1.8 gr",R.drawable.cl004cocp_41));

        return enamoros;


    }




}
package com.example.villa;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;

public class detalleArgollaActivity extends AppCompatActivity {

    ImageView foto;
    TextView sku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_argolla);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        foto = findViewById(R.id.imgEnamoro);
        sku = findViewById(R.id.txtcodigo);

        StyleableToast.makeText(this, "El peso promedio en cada argolla es equivalente al #9", Toast.LENGTH_LONG, R.style.mytoast).show();
        Datos obj = (Datos) getIntent().getExtras().getSerializable("objeto");

        sku.setText(obj.getSku());
        foto.setImageResource(obj.getImagen());
    }
}
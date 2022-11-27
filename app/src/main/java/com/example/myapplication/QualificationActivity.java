package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.myapplication.listas.HistorialModel;

public class QualificationActivity extends AppCompatActivity {

    public TextView nombre, correo, numero, trabajo;
    public ImageView fotoPerfil;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualification);

        ratingBar = (RatingBar) findViewById(R.id.satisfaccion);
        ratingBar = (RatingBar) findViewById(R.id.disposición);

        HistorialModel historialModel = (HistorialModel) getIntent().getSerializableExtra("HISTORIAL");
        nombre = findViewById(R.id.workerName);
        fotoPerfil = findViewById(R.id.sugerenciaImagen);

        nombre.setText("El trabajo realizado por: " + historialModel.getNombre());
        fotoPerfil.setImageResource(historialModel.getImg());

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
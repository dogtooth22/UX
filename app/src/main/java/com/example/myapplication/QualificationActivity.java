package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.listas.HistorialModel;
import com.example.myapplication.menu.HistoryActivity;
import com.google.android.material.snackbar.Snackbar;

public class QualificationActivity extends AppCompatActivity {

    public TextView nombre, correo, numero, trabajo;
    public ImageView fotoPerfil;
    private RatingBar ratingBar;
    private Button enviar;
    private int encuesta = 0;

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
        enviar = findViewById(R.id.calificacionEnviar);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
    public void EnviarCalificacion(View view){
        Toast.makeText(getApplicationContext(),"Se ha enviado la calificación correctamente.",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(QualificationActivity.this,HistoryActivity.class);
        startActivity(intent);
    }
}
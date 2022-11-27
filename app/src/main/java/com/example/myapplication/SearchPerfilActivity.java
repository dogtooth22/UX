package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.myapplication.listas.SugerenciaModel;
import com.example.myapplication.menu.CrearTrabajo;
import com.example.myapplication.menu.SearchActivity;

public class SearchPerfilActivity extends AppCompatActivity {
    public TextView nombre, correo, numero, trabajo;
    public ImageView fotoPerfil;
    public RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_perfil);

        SugerenciaModel sugerenciaModel = (SugerenciaModel) getIntent().getSerializableExtra("SUGERENCIA");
        nombre = findViewById(R.id.searchPerfil_nombre);
        correo = findViewById(R.id.searchPerfil_correo);
        numero = findViewById(R.id.searchPerfil_numero);
        trabajo = findViewById(R.id.searchPerfil_trabajo);
        fotoPerfil = findViewById(R.id.searchPerfil_foto);
        ratingBar = findViewById(R.id.searchPerfil_rating);

        nombre.setText("Nombre: "+sugerenciaModel.getName());
        correo.setText("Correo: "+sugerenciaModel.getMail());
        numero.setText("Numero: "+sugerenciaModel.getNumber());
        trabajo.setText("Trabajo: "+sugerenciaModel.getJob());
        fotoPerfil.setImageResource(sugerenciaModel.getIdR());
    }

    public void Ratings(View view){
        Intent intent = new Intent(SearchPerfilActivity.this, ComentariosActivity.class);
        startActivity(intent);
    }
}
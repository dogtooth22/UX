package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.myapplication.listas.ListAdapterSugerencia;
import com.example.myapplication.listas.SugerenciaModel;

import java.util.ArrayList;
import java.util.List;

public class CrearTrabajo extends AppCompatActivity {

    List<SugerenciaModel> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_trabajo);

        init();
    }
    public void init(){
        elements = new ArrayList<>();
        Log.d("TRABAJO","Agregue un trabajo");
        elements.add(new SugerenciaModel("Bruce Springteen","Gasfiter","A 1 km. De uno","+56910203044","bruces@usm.cl",R.drawable.sugerencia1));
        elements.add(new SugerenciaModel("Mario Bros","Gasfiter","A 5 km. De uno","+56913243241","mariobros@usm.cl",R.drawable.sugerencia2));
        elements.add(new SugerenciaModel("Luis Perez","Gasfiter","A 2 km. De uno","+56910203044","luisperez@usm.cl",R.drawable.sugerencia3));
        elements.add(new SugerenciaModel("Mauricio Walls","Gasfiter","A 10 km. De uno","+56910203044","mauricio_paredes@usm.cl",R.drawable.sugerencia4));
        elements.add(new SugerenciaModel("Marcelo Salas","Gasfiter","A 3 km. De uno","+56910203044","matador_salas@usm.cl",R.drawable.sugerencia5));
        elements.add(new SugerenciaModel("Arturo Aranguiz","Gasfiter","A 8 km. De uno","+56910203044","king23@usm.cl",R.drawable.sugerencia6));
        elements.add(new SugerenciaModel("Pedro Vicencio","Gasfiter","A 12 km. De uno","+56910203044","pedro_vicencio@usm.cl",R.drawable.sugerencia7));



        ListAdapterSugerencia adapter = new ListAdapterSugerencia(elements,this);
        RecyclerView recyclerView = findViewById(R.id.sugerenciaLista);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
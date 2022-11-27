package com.example.myapplication.menu;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.listas.HistorialModel;
import com.example.myapplication.listas.ListAdapterHistorial;
import com.example.myapplication.listas.ListAdapterSugerencia;
import com.example.myapplication.listas.SugerenciaModel;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {
    List<HistorialModel> elements;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_activity);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        init();
    }
    public void init(){
        elements = new ArrayList<>();
        elements.add(new HistorialModel("Juanito Perez","Gasfiter","Evaluar", R.drawable.ic_baseline_access_time_24, R.drawable.sugerencia1));
        elements.add(new HistorialModel("Mario Bros","Gasfiter","Evaluado", R.drawable.ic_baseline_check_24, R.drawable.sugerencia2));

        ListAdapterHistorial adapter = new ListAdapterHistorial(elements,this);
        RecyclerView recyclerView = findViewById(R.id.historiallist);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}

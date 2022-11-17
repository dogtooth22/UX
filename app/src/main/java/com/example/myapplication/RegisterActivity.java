package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
    }

    public void register(View view){
        Intent register = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(register);
        Toast.makeText(getApplicationContext(),"Cuenta creada correctamente!",Toast.LENGTH_SHORT).show();
    }
}

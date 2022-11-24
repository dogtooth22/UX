package com.example.myapplication.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
    }

    public void profile(View view){
        Intent register = new Intent(MenuActivity.this, ProfileActivity.class);
        startActivity(register);
    }

    public void map(View view){
        Intent register = new Intent(MenuActivity.this, SearchActivity.class);
        startActivity(register);
    }

    public void history(View view){
        //Intent register = new Intent(MenuActivity.this, HistoryActivity.class);
        //startActivity(register);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}

package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }

    public void login(View view){
        EditText email = (EditText) findViewById(R.id.loginEmail);
        EditText password = (EditText) findViewById(R.id.loginPassword);

        if(email.getText().toString().equals("ux@usm.cl")){
            if(password.getText().toString().equals("123456")){
                Intent login = new Intent(LoginActivity.this, SearchActivity.class);
                startActivity(login);
            }
        }
        // Toast.makeText(getApplicationContext(),"Email or password incorrect",Toast.LENGTH_SHORT).show();

    }

    public void toForgotPassword(View view){
        Toast.makeText(getApplicationContext(),"Aún no está listo uwu",Toast.LENGTH_SHORT).show();
    }

    public void register(View view) {
        Intent register = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(register);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}

package com.example.myapplication.start;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.menu.MenuActivity;
import com.example.myapplication.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }

    public void login(View view){
        EditText email = (EditText) findViewById(R.id.loginEmail);
        EditText password = (EditText) findViewById(R.id.loginPassword);
        TextInputLayout emailLayout = findViewById(R.id.login_emailLayout);
        TextInputLayout passLayout = findViewById(R.id.login_passlayout);

        if (email.getText().toString().isEmpty()){
            emailLayout.setError("Ingrese un correo porfavor.");
        }
        if (password.getText().toString().isEmpty()){
            passLayout.setError("Ingrese una contraseña porfavor.");
        }
        if(email.getText().toString().equals("ux@usm.cl")){
            if(password.getText().toString().equals("123456")){
                Intent login = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(login);
            }
            else{
                Snackbar.make(view,"Credenciales incorrectas.",Snackbar.LENGTH_LONG).setAction("Action",null).show();
            }
        }
        else{
            Snackbar.make(view,"Credenciales incorrectas.",Snackbar.LENGTH_LONG).setAction("Action",null).show();
        }
    }

    public void toForgotPassword(View view){
        Toast.makeText(getApplicationContext(),"Próximamente",Toast.LENGTH_SHORT).show();
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

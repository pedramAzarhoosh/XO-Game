package com.example.xogame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RegisterMenu extends AppCompatActivity {
    EditText name,password,secPassword,email;
    String username,pass,secPass,e;
    Button registerBtn;
    RadioButton male,female;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_menu);

        name = findViewById(R.id.nameTxt);
        password = findViewById(R.id.firstPass);
        registerBtn = findViewById(R.id.registerButton);
        secPassword = findViewById(R.id.secPass);
        email = findViewById(R.id.email);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);


        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = name.getText().toString();
                pass = password.getText().toString();
                e = email.getText().toString();
                secPass = secPassword.getText().toString();
                
                if(username.isEmpty()){
                    Toast.makeText(RegisterMenu.this, "Enter a name", Toast.LENGTH_SHORT).show();
                }else if(pass.isEmpty() || pass.length()<5){
                    Toast.makeText(RegisterMenu.this, "password is week", Toast.LENGTH_SHORT).show();
                    password.setText("");
                }else if (!secPass.equals(pass)) {
                    Toast.makeText(RegisterMenu.this, "second password doesnt match", Toast.LENGTH_SHORT).show();
                    secPassword.setText("");
                } else if (!e.contains("@gmail.com")) {
                    Toast.makeText(RegisterMenu.this, "The email is not in correct form", Toast.LENGTH_SHORT).show();
                    email.setText("");
                }  else {
                    Intent loginIntent = new Intent(RegisterMenu.this, LoginMenu.class);
                    loginIntent.putExtra("name", username);
                    loginIntent.putExtra("password", pass);
                    startActivity(loginIntent);
                    finish();
                }
            }
        });

    }
}
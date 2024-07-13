package com.example.xogame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Initial_screen extends AppCompatActivity {

    Button RegBtn,LoginBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_screen);

        RegBtn = findViewById(R.id.reg);
        LoginBtn = findViewById(R.id.log);

        RegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Initial_screen.this,RegisterMenu.class);
                startActivity(registerIntent);
            }
        });

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(Initial_screen.this,LoginMenu.class);
                startActivity(LoginIntent);
            }
        });
    }
}
package com.example.xogame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class XorY extends AppCompatActivity {
    Button X,O;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xor_y);

        X = findViewById(R.id.x_btn);
        O = findViewById(R.id.o_btn);

        Intent intent = new Intent(XorY.this,HorC.class);

        String x = "X";
        String o = "O";
        String firstPlayer = getIntent().getStringExtra("playerName");

        X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("which",x);
                intent.putExtra("name",firstPlayer);
                startActivity(intent);
            }
        });

        O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("which",o);
                intent.putExtra("name",firstPlayer);
                startActivity(intent);
            }
        });
    }
}
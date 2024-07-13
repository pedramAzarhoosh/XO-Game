package com.example.xogame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HorC extends AppCompatActivity {
    Button human,cpu,done;
    EditText name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hor_c);

        human = findViewById(R.id.human_btn);
        cpu = findViewById(R.id.cpu_btn);
        done = findViewById(R.id.done_btn);
        name = findViewById(R.id.against_name);
        String which = getIntent().getStringExtra("which");
        String firstPName = getIntent().getStringExtra("name");





        human.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setVisibility(View.VISIBLE);
                done.setVisibility(View.VISIBLE);
            }
        });

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(HorC.this,Game_page.class);
                    intent.putExtra("which", which);
                    intent.putExtra("first", firstPName);
                    intent.putExtra("second", name.getText().toString());
                    startActivity(intent);
            }
        });


    }
}
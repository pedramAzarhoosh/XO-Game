package com.example.xogame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pass_recovery extends AppCompatActivity {
    EditText firstPass,repPass;
    Button accept;
    String p1,p2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_recovery);

        firstPass = findViewById(R.id.rec_pass);
        repPass = findViewById(R.id.sec_rec_pass);
        accept = findViewById(R.id.accept_btn);

        p1 = firstPass.getText().toString();
        p2 = repPass.getText().toString();

        String username = getIntent().getStringExtra("name");

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p1.length()<5){
                    Toast.makeText(Pass_recovery.this, "Password is week", Toast.LENGTH_SHORT).show();
                    firstPass.setText("");
                    repPass.setText("");
                }else if(!p1.equals(p2)){
                    Toast.makeText(Pass_recovery.this, "Wrong password", Toast.LENGTH_SHORT).show();
                    repPass.setText("");
                }else {
                    Intent intent = new Intent(Pass_recovery.this,LoginMenu.class);
                    intent.putExtra("name",username);
                    intent.putExtra("password",p1);
                    startActivity(intent);
                }
            }
        });
    }
}
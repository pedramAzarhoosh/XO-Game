package com.example.xogame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginMenu extends AppCompatActivity {
    Button loginBtn;
    EditText name,password;
    String username,pass;
    TextView forgotPass;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_menu);

        loginBtn = findViewById(R.id.loginButton);
        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        forgotPass = findViewById(R.id.forgot_pass);

        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginMenu.this,Pass_recovery.class);
                intent.putExtra("name",name.getText().toString());
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        if(intent != null){
            username = intent.getStringExtra("name");
            pass = intent.getStringExtra("password");
        }

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.equals(name.getText().toString()) && pass.equals(password.getText().toString())){
                    Intent intent1 = new Intent(LoginMenu.this,XorY.class);
                    intent1.putExtra("playerName",username);
                    startActivity(intent1);
                }else {
                    Toast.makeText(LoginMenu.this, "username doesnt match with the password", Toast.LENGTH_SHORT).show();
                    name.setText("");
                    password.setText("");
                }
            }
        });
    }
}
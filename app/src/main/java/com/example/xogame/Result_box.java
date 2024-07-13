package com.example.xogame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result_box extends AppCompatActivity {
    Button restart;
    TextView msg;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_box);

        restart = findViewById(R.id.restartButton);
        msg = findViewById(R.id.messageTxt);

        String winner = getIntent().getStringExtra("winner_name");
        String loser = getIntent().getStringExtra("loser_name");
        String message = winner + " wins!";
        String message2 = loser + " lose";
        String draw = "Draw";

        if(winner.equals("Draw")){
            msg.setText(draw);
        }else if(!winner.isEmpty()) {
            msg.setText(message);
        }else {
            msg.setText(message2);
        }

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result_box.this,Game_page.class);
                startActivity(intent);
            }
        });
    }
}
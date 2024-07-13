package com.example.xogame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Game_page extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextView turn;
    boolean firstPlayerTurn,secPlayerTurn;
    String firstPlayer,secPlayer,which;
    String firstSymbol,secSymbol;
    Random random = new Random();
    String first,second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page);

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        turn = findViewById(R.id.turn_txt);

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        turn.setText("");


        which = getIntent().getStringExtra("which");
        firstPlayer = getIntent().getStringExtra("first");
        secPlayer = getIntent().getStringExtra("second");

        firstSymbol = which;
        if(which.equals("X")){
            secSymbol = "O";
        }else {
            secSymbol = "X";
        }

        firstTurn(firstPlayer,secPlayer);


    }

    public void firstTurn(String firstName,String secName){
        first = firstName + "(" + firstSymbol + ") turn"  ;
        second = secName + "(" + secSymbol + ") turn";
        if(random.nextInt(2) == 0){
            firstPlayerTurn = true;
            turn.setText(first);
            actionPerformed();
        }else {
            secPlayerTurn = true;
            turn.setText(second);
            actionPerformed();
        }
    }

    int c=1;

    public void actionPerformed() {
        for (int i=1;i<=9;i++){
               btn1.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       if(firstPlayerTurn){
                           firstPlayerTurn = false;
                           secPlayerTurn = true;
                           btn1.setText(firstSymbol);
                           turn.setText(second);
                           c++;
                           check(c);
                       }else{
                           firstPlayerTurn = true;
                           secPlayerTurn = false;
                           btn1.setText(secSymbol);
                           turn.setText(first);
                           c++;
                           check(c);
                       }
                   }
               });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(firstPlayerTurn){
                        firstPlayerTurn = false;
                        secPlayerTurn = true;
                        btn2.setText(firstSymbol);
                        turn.setText(second);
                        c++;
                        check(c);
                    }else{
                        firstPlayerTurn = true;
                        secPlayerTurn = false;
                        btn2.setText(secSymbol);
                        turn.setText(first);
                        c++;
                        check(c);
                    }
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(firstPlayerTurn){
                        firstPlayerTurn = false;
                        secPlayerTurn = true;
                        btn3.setText(firstSymbol);
                        turn.setText(second);
                        c++;
                        check(c);
                    }else{
                        firstPlayerTurn = true;
                        secPlayerTurn = false;
                        btn3.setText(secSymbol);
                        turn.setText(first);
                        c++;
                        check(c);
                    }
                }
            });

            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(firstPlayerTurn){
                        firstPlayerTurn = false;
                        secPlayerTurn = true;
                        btn4.setText(firstSymbol);
                        turn.setText(second);
                        c++;
                        check(c);
                    }else{
                        firstPlayerTurn = true;
                        secPlayerTurn = false;
                        btn4.setText(secSymbol);
                        turn.setText(first);
                        c++;
                        check(c);
                    }
                }
            });

            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(firstPlayerTurn){
                        firstPlayerTurn = false;
                        secPlayerTurn = true;
                        btn5.setText(firstSymbol);
                        turn.setText(second);
                        c++;
                        check(c);
                    }else{
                        firstPlayerTurn = true;
                        secPlayerTurn = false;
                        btn5.setText(secSymbol);
                        turn.setText(first);
                        c++;
                        check(c);
                    }
                }
            });

            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(firstPlayerTurn){
                        firstPlayerTurn = false;
                        secPlayerTurn = true;
                        btn6.setText(firstSymbol);
                        turn.setText(second);
                        c++;
                        check(c);
                    }else{
                        firstPlayerTurn = true;
                        secPlayerTurn = false;
                        btn6.setText(secSymbol);
                        turn.setText(first);
                        c++;
                        check(c);
                    }
                }
            });

            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(firstPlayerTurn){
                        firstPlayerTurn = false;
                        secPlayerTurn = true;
                        btn7.setText(firstSymbol);
                        turn.setText(second);
                        c++;
                        check(c);
                    }else{
                        firstPlayerTurn = true;
                        secPlayerTurn = false;
                        btn7.setText(secSymbol);
                        turn.setText(first);
                        c++;
                        check(c);
                    }
                }
            });

            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(firstPlayerTurn){
                        firstPlayerTurn = false;
                        secPlayerTurn = true;
                        btn8.setText(firstSymbol);
                        turn.setText(second);
                        c++;
                        check(c);
                    }else{
                        firstPlayerTurn = true;
                        secPlayerTurn = false;
                        btn8.setText(secSymbol);
                        turn.setText(first);
                        c++;
                        check(c);
                    }
                }
            });

            btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(firstPlayerTurn){
                        firstPlayerTurn = false;
                        secPlayerTurn = true;
                        btn9.setText(firstSymbol);
                        turn.setText(second);
                        c++;
                        check(c);
                    }else{
                        firstPlayerTurn = true;
                        secPlayerTurn = false;
                        btn9.setText(secSymbol);
                        turn.setText(first);
                        c++;
                        check(c);
                    }
                }
            });
        }
    }

    public void check(int i){
        Intent intent = new Intent(Game_page.this,Result_box.class);

        if(btn1.getText().toString().equals(firstSymbol) && btn2.getText().toString().equals(firstSymbol) &&
        btn3.getText().toString().equals(firstSymbol)){
            intent.putExtra("winner_name",firstPlayer);
            startActivity(intent);
        }else if(btn4.getText().toString().equals(firstSymbol) && btn5.getText().toString().equals(firstSymbol) &&
                btn6.getText().toString().equals(firstSymbol)){
            intent.putExtra("winner_name",firstPlayer);
            startActivity(intent);
        }else if(btn7.getText().toString().equals(firstSymbol) && btn8.getText().toString().equals(firstSymbol) &&
                btn9.getText().toString().equals(firstSymbol)){
            intent.putExtra("winner_name",firstPlayer);
            startActivity(intent);
        }else if(btn1.getText().toString().equals(firstSymbol) && btn4.getText().toString().equals(firstSymbol) &&
                btn7.getText().toString().equals(firstSymbol)){
            intent.putExtra("winner_name",firstPlayer);
            startActivity(intent);
        }else if(btn2.getText().toString().equals(firstSymbol) && btn5.getText().toString().equals(firstSymbol) &&
                btn8.getText().toString().equals(firstSymbol)){
            intent.putExtra("winner_name",firstPlayer);
            startActivity(intent);
        }else if(btn3.getText().toString().equals(firstSymbol) && btn6.getText().toString().equals(firstSymbol) &&
                btn9.getText().toString().equals(firstSymbol)){
            intent.putExtra("winner_name",firstPlayer);
            startActivity(intent);
        }else if(btn1.getText().toString().equals(firstSymbol) && btn5.getText().toString().equals(firstSymbol) &&
                btn9.getText().toString().equals(firstSymbol)){
            intent.putExtra("winner_name",firstPlayer);
            startActivity(intent);
        }else if(btn3.getText().toString().equals(firstSymbol) && btn5.getText().toString().equals(firstSymbol) &&
                btn7.getText().toString().equals(firstSymbol)){
            intent.putExtra("winner_name",firstPlayer);
            startActivity(intent);
        }

        else if(btn1.getText().toString().equals(secSymbol) && btn2.getText().toString().equals(secSymbol) &&
                btn3.getText().toString().equals(secSymbol)){
            intent.putExtra("winner_name",secPlayer);
            startActivity(intent);
        }else if(btn4.getText().toString().equals(secSymbol) && btn5.getText().toString().equals(secSymbol) &&
                btn6.getText().toString().equals(secSymbol)){
            intent.putExtra("winner_name",secPlayer);
            startActivity(intent);
        }else if(btn7.getText().toString().equals(secSymbol) && btn8.getText().toString().equals(secSymbol) &&
                btn9.getText().toString().equals(secSymbol)){
            intent.putExtra("winner_name",secPlayer);
            startActivity(intent);
        }else if(btn1.getText().toString().equals(secSymbol) && btn4.getText().toString().equals(secSymbol) &&
                btn7.getText().toString().equals(secSymbol)){
            intent.putExtra("winner_name",secPlayer);
            startActivity(intent);
        }else if(btn2.getText().toString().equals(secSymbol) && btn5.getText().toString().equals(secSymbol) &&
                btn8.getText().toString().equals(secSymbol)){
            intent.putExtra("winner_name",secPlayer);
            startActivity(intent);
        }else if(btn3.getText().toString().equals(secSymbol) && btn6.getText().toString().equals(secSymbol) &&
                btn9.getText().toString().equals(secSymbol)){
            intent.putExtra("winner_name",secPlayer);
            startActivity(intent);
        }else if(btn1.getText().toString().equals(secSymbol) && btn5.getText().toString().equals(secSymbol) &&
                btn9.getText().toString().equals(secSymbol)){
            intent.putExtra("winner_name",secPlayer);
            startActivity(intent);
        }else if(btn3.getText().toString().equals(secSymbol) && btn5.getText().toString().equals(secSymbol) &&
                btn7.getText().toString().equals(secSymbol)){
            intent.putExtra("winner_name",secPlayer);
            startActivity(intent);
        }else {
            if(c==9){
                String draw = "Draw";
                intent.putExtra("winner_name",draw);
                startActivity(intent);
            }
        }






    }
}
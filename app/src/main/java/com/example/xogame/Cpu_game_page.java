package com.example.xogame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Cpu_game_page extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextView turn;
    boolean humanPlayerTurn,cpuTurn;

    String[][] board = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
    };

    String name, hChar,cpuSymbol;

    Random random;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpu_game_page);

        btn1 = findViewById(R.id.cbtn_1);
        btn2 = findViewById(R.id.cbtn_2);
        btn3 = findViewById(R.id.cbtn_3);
        btn4 = findViewById(R.id.cbtn_4);
        btn5 = findViewById(R.id.cbtn_5);
        btn6 = findViewById(R.id.cbtn_6);
        btn7 = findViewById(R.id.cbtn_7);
        btn8 = findViewById(R.id.cbtn_8);
        btn9 = findViewById(R.id.cbtn_9);
        turn = findViewById(R.id.cturn_txt);

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

        name = getIntent().getStringExtra("name");
        hChar = getIntent().getStringExtra("which");

        if (hChar != null && hChar.equals("X")) {
            cpuSymbol = "O";
        }else  cpuSymbol = "X";


        firstTurn();


    }

    public void firstTurn(){
        String first = "Your turn";
        String second = "Computer turn";
        if(random.nextInt(2) == 0){
            humanPlayerTurn = true;
            turn.setText(first);
            performAction();
        }else {
            cpuTurn = true;
            turn.setText(second);
            performAction();
        }
    }


    public void performAction(){
        Intent intent = new Intent(Cpu_game_page.this,Result_box.class);
        String hTurn = "Your turn";
        String cTurn = "Computer turn";
        String draw = "Draw";
        for (int i=1;i<=9;i++) {
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (humanPlayerTurn) {
                        humanPlayerTurn = false;
                        cpuTurn = true;
                        playerMove("1");
                        if (isGameFinished() == -1) {
                            intent.putExtra("winner_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(cTurn);
                    } else {
                        humanPlayerTurn = true;
                        cpuTurn = false;
                        computerMove();
                        btn1.setText(cpuSymbol);
                        if (isGameFinished() == 1) {
                            intent.putExtra("loser_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(hTurn);
                    }
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (humanPlayerTurn) {
                        humanPlayerTurn = false;
                        cpuTurn = true;
                        playerMove("2");
                        if (isGameFinished() == -1) {
                            intent.putExtra("winner_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(cTurn);
                    } else {
                        humanPlayerTurn = true;
                        cpuTurn = false;
                        computerMove();
                        btn2.setText(cpuSymbol);
                        if (isGameFinished() == 1) {
                            intent.putExtra("loser_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(hTurn);
                    }
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (humanPlayerTurn) {
                        humanPlayerTurn = false;
                        cpuTurn = true;
                        playerMove("3");
                        if (isGameFinished() == -1) {
                            intent.putExtra("winner_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(cTurn);
                    } else {
                        humanPlayerTurn = true;
                        cpuTurn = false;
                        computerMove();
                        btn3.setText(cpuSymbol);
                        if (isGameFinished() == 1) {
                            intent.putExtra("loser_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(hTurn);
                    }
                }
            });

            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (humanPlayerTurn) {
                        humanPlayerTurn = false;
                        cpuTurn = true;
                        playerMove("4");
                        if (isGameFinished() == -1) {
                            intent.putExtra("winner_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(cTurn);
                    } else {
                        humanPlayerTurn = true;
                        cpuTurn = false;
                        computerMove();
                        btn4.setText(cpuSymbol);
                        if (isGameFinished() == 1) {
                            intent.putExtra("loser_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(hTurn);
                    }
                }
            });


            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (humanPlayerTurn) {
                        humanPlayerTurn = false;
                        cpuTurn = true;
                        playerMove("5");
                        if (isGameFinished() == -1) {
                            intent.putExtra("winner_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(cTurn);
                    } else {
                        humanPlayerTurn = true;
                        cpuTurn = false;
                        computerMove();
                        btn5.setText(cpuSymbol);
                        if (isGameFinished() == 1) {
                            intent.putExtra("loser_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(hTurn);
                    }
                }
            });


            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (humanPlayerTurn) {
                        humanPlayerTurn = false;
                        cpuTurn = true;
                        playerMove("6");
                        if (isGameFinished() == -1) {
                            intent.putExtra("winner_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(cTurn);
                    } else {
                        humanPlayerTurn = true;
                        cpuTurn = false;
                        computerMove();
                        btn6.setText(cpuSymbol);
                        if (isGameFinished() == 1) {
                            intent.putExtra("loser_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(hTurn);
                    }
                }
            });


            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (humanPlayerTurn) {
                        humanPlayerTurn = false;
                        cpuTurn = true;
                        playerMove("7");
                        if (isGameFinished() == -1) {
                            intent.putExtra("winner_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(cTurn);
                    } else {
                        humanPlayerTurn = true;
                        cpuTurn = false;
                        computerMove();
                        btn7.setText(cpuSymbol);
                        if (isGameFinished() == 1) {
                            intent.putExtra("loser_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(hTurn);
                    }
                }
            });


            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (humanPlayerTurn) {
                        humanPlayerTurn = false;
                        cpuTurn = true;
                        playerMove("8");
                        if (isGameFinished() == -1) {
                            intent.putExtra("winner_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(cTurn);
                    } else {
                        humanPlayerTurn = true;
                        cpuTurn = false;
                        computerMove();
                        btn8.setText(cpuSymbol);
                        if (isGameFinished() == 1) {
                            intent.putExtra("loser_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(hTurn);
                    }
                }
            });


            btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (humanPlayerTurn) {
                        humanPlayerTurn = false;
                        cpuTurn = true;
                        playerMove("9");
                        if (isGameFinished() == -1) {
                            intent.putExtra("winner_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(cTurn);
                    } else {
                        humanPlayerTurn = true;
                        cpuTurn = false;
                        computerMove();
                        btn9.setText(cpuSymbol);
                        if (isGameFinished() == 1) {
                            intent.putExtra("loser_name", name);
                            startActivity(intent);
                        } else if (isGameFinished() == 0) {
                            intent.putExtra("winner_name", draw);
                        }
                        turn.setText(hTurn);
                    }
                }
            });

        }


    }

    private int isGameFinished() {
        if (hasContestantWon(hChar)) {
            return -1;
        }
        if (hasContestantWon(cpuSymbol)) {
            return 1;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals(" ")) {
                    return 2;
                }
            }
        }
        return 0;
    }


    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    /*private boolean isValidMove(String position) {
        switch (position) {
            case "1":
                return (board[0][0].equals(" "));
            case "2":
                return (board[0][1].equals(" "));
            case "3":
                return (board[0][2].equals(" "));
            case "4":
                return (board[1][0].equals(" "));
            case "5":
                return (board[1][1].equals(" "));
            case "6":
                return (board[1][2].equals(" "));
            case "7":
                return (board[2][0].equals(" "));
            case "8":
                return (board[2][1].equals(" "));
            case "9":
                return (board[2][2].equals(" "));
            default:
                return false;
        }
    }*/

    private void placeMove(String position, String symbol) {
        switch (position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println("Invalid move.");
        }
    }

    private void computerMove() {
        int[] bestMove = minimax(0, "O");
        board[bestMove[0]][bestMove[1]] = "O";
    }

    private int[] minimax(int depth, String player) {
        int[] bestMove = new int[]{-1, -1, (player.equals("O")) ? Integer.MIN_VALUE : Integer.MAX_VALUE};

        if (hasContestantWon("O")) return new int[]{-1, -1, 10 - depth};
        if (hasContestantWon("X")) return new int[]{-1, -1, depth - 10};
        if (isBoardFull()) return new int[]{-1, -1, 0};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(" ")) {
                    board[i][j] = player;
                    int currentScore = minimax(depth + 1, (player.equals("O")) ? "X" : "O")[2];
                    board[i][j] = " ";

                    if (player.equals("O")) {
                        if (currentScore > bestMove[2]) {
                            bestMove[0] = i;
                            bestMove[1] = j;
                            bestMove[2] = currentScore;
                        }
                    } else {
                        if (currentScore < bestMove[2]) {
                            bestMove[0] = i;
                            bestMove[1] = j;
                            bestMove[2] = currentScore;
                        }
                    }
                }
            }
        }
        return bestMove;
    }


    private boolean hasContestantWon(String symbol) {
        if ((board[0][0].equals(symbol) && board[0][1].equals(symbol) && board[0][2].equals(symbol)) ||
                (board[1][0].equals(symbol) && board[1][1].equals(symbol) && board[1][2].equals(symbol)) ||
                (board[2][0].equals(symbol) && board[2][1].equals(symbol) && board[2][2].equals(symbol)) ||
                (board[0][0].equals(symbol) && board[1][0].equals(symbol) && board[2][0].equals(symbol)) ||
                (board[0][1].equals(symbol) && board[1][1].equals(symbol) && board[2][1].equals(symbol)) ||
                (board[0][2].equals(symbol) && board[1][2].equals(symbol) && board[2][2].equals(symbol)) ||
                (board[0][0].equals(symbol) && board[1][1].equals(symbol) && board[2][2].equals(symbol)) ||
                (board[0][2].equals(symbol) && board[1][1].equals(symbol) && board[2][0].equals(symbol))) {
            return true;
        }
        return false;
    }

    private void playerMove(String pos) {
        /*while (true) {
            if (isValidMove(pos)) {
                break;
            } else {
                performAction();
            }
        }*/
        placeMove(pos, hChar);
    }
}
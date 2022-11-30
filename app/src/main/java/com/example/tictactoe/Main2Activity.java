package com.example.tictactoe;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    int TURNCOUNT = 0;

    TextView textview9;
    TextView textView18;
    String textview1;
    String textview2;
    Button buttons[] = new Button[9];

    Button b00;
    Button b01;
    Button b02;

    Button b10;
    Button b11;
    Button b12;

    Button b20;
    Button b21;
    Button b22;

    int[][] boardsarray = new int[3][3];
    boolean Player_x = true;
    TextView tvinfo;

    Button reset;

    RelativeLayout rl;
    private static final int[] BUTTON_IDS = {
            R.id.b00,
            R.id.b01,
            R.id.b02,
            R.id.b10,
            R.id.b11,
            R.id.b12,
            R.id.b20,
            R.id.b21,
            R.id.b22,
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        textview9 = findViewById(R.id.pl1);
        textView18 = findViewById(R.id.pl2);
        tvinfo = findViewById(R.id.info);

        b00 = findViewById(R.id.b00);
        b01 = findViewById(R.id.b01);
        b02 = findViewById(R.id.b02);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);


        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);

        reset = findViewById(R.id.rst9);

        rl = findViewById(R.id.rl);

        String aa = getIntent().getStringExtra("Player1");
        String bb = getIntent().getStringExtra("Player2");

        textview9.setText(aa);
        textView18.setText(bb);

        b00.setOnClickListener(this);
        b01.setOnClickListener(this);
        b02.setOnClickListener(this);

        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);

        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);

        reset.setOnClickListener(this);


        initializeboardsarray();


        b00.setBackground(getResources().getDrawable(R.drawable.shape));
        b01.setBackground(getResources().getDrawable(R.drawable.shape));
        b02.setBackground(getResources().getDrawable(R.drawable.shape));

        b10.setBackground(getResources().getDrawable(R.drawable.shape));
        b11.setBackground(getResources().getDrawable(R.drawable.shape));
        b12.setBackground(getResources().getDrawable(R.drawable.shape));

        b20.setBackground(getResources().getDrawable(R.drawable.shape));
        b21.setBackground(getResources().getDrawable(R.drawable.shape));
        b22.setBackground(getResources().getDrawable(R.drawable.shape));
    }



    @Override
    public void onClick(View v) {
        boolean resetbuttonpressed = false;
        switch (v.getId()) {
            case R.id.b00:
                if (Player_x) {
                    b00.setText("X");
                    boardsarray[0][0] = 1;
                } else {
                    b00.setText("O");
                    boardsarray[0][0] = 0;
                }
                b00.setEnabled(false);
                break;

            case R.id.b01:
                if (Player_x) {
                    b01.setText("X");
                    boardsarray[0][1] = 1;
                } else {
                    b01.setText("O");
                    boardsarray[0][1] = 0;
                }
                b01.setEnabled(false);
                break;

            case R.id.b02:
                if (Player_x) {
                    b02.setText("X");
                    boardsarray[0][2] = 1;
                } else {
                    b02.setText("O");
                    boardsarray[0][2] = 0;
                }
                b02.setEnabled(false);
                break;

            case R.id.b10:
                if (Player_x) {
                    b10.setText("X");
                    boardsarray[1][0] = 1;
                } else {
                    b10.setText("O");
                    boardsarray[1][0] = 0;
                }
                ;
                b10.setEnabled(false);
                break;

            case R.id.b11:
                if (Player_x) {
                    b11.setText("X");
                    boardsarray[1][1] = 1;
                } else {
                    b11.setText("O");
                    boardsarray[1][1] = 0;
                }
                b11.setEnabled(false);
                break;

            case R.id.b12:
                if (Player_x) {
                    b12.setText("X");
                    boardsarray[1][2] = 1;
                } else {
                    b12.setText("O");
                    boardsarray[1][2] = 0;
                }
                b12.setEnabled(false);
                break;

            case R.id.b20:
                if (Player_x) {
                    b20.setText("X");
                    boardsarray[2][0] = 1;
                } else {
                    b20.setText("O");
                    boardsarray[2][0] = 0;
                }
                b20.setEnabled(false);
                break;

            case R.id.b21:
                if (Player_x) {
                    b21.setText("X");
                    boardsarray[2][1] = 1;
                } else {
                    b21.setText("O");
                    boardsarray[2][1] = 0;
                }
                b21.setEnabled(false);

                break;

            case R.id.b22:
                if (Player_x) {
                    b22.setText("X");
                    boardsarray[2][2] = 1;
                } else {
                    b22.setText("O");
                    boardsarray[2][2] = 0;
                }
                b22.setEnabled(false);
                break;

            case R.id.rst9:
                resetbuttonpressed = true;
                break;

            default:
                break;

        }

        textview1 = (String) textview9.getText();
        textview2 = (String) textView18.getText();


        if (resetbuttonpressed) {
            onreset();
        } else {
            TURNCOUNT++;
            Player_x = !Player_x;

            if (Player_x) {
                setInfo(textview1 + "'s turn");
            } else {
                setInfo(textview2 + "'s turn");
            }

            if (TURNCOUNT == 9) {
                result("Game Draw");
            }

            checkWinner();
        }
    }

    private void result(String winner) {
        setInfo(winner);
        enablebox(false);

    }

    private void onreset() {

        b00.setText("");
        b01.setText("");
        b02.setText("");

        b10.setText("");
        b11.setText("");
        b12.setText("");

        b20.setText("");
        b21.setText("");
        b22.setText("");

        TURNCOUNT = 0;
        Player_x = true;
        enablebox(true);
        TURNCOUNT++;
        initializeboardsarray();
        tvinfo.setText("");
    }
    public void checkWinner() {

        for (int i = 0; i < 3; i++) {

            if (boardsarray[0][0] == 1 && boardsarray[0][1] == 1 && boardsarray[0][2] == 1) {
                result("won  : " + textview1);
                b00.setBackground(getResources().getDrawable(R.drawable.cell));
                b01.setBackground(getResources().getDrawable(R.drawable.cell));
                b02.setBackground(getResources().getDrawable(R.drawable.cell));
                break;

            } else if (boardsarray[0][0] == 0 && boardsarray[0][1] == 0 && boardsarray[0][2] == 0) {
                result("won : " + textview2);
                b00.setBackground(getResources().getDrawable(R.drawable.cell));
                b01.setBackground(getResources().getDrawable(R.drawable.cell));
                b02.setBackground(getResources().getDrawable(R.drawable.cell));
                break;
            } else if (boardsarray[1][0] == 1 && boardsarray[1][1] == 1 && boardsarray[1][2] == 1) {
                result("won  : " + textview1);
                b10.setBackground(getResources().getDrawable(R.drawable.cell));
                b11.setBackground(getResources().getDrawable(R.drawable.cell));
                b12.setBackground(getResources().getDrawable(R.drawable.cell));
                break;

            } else if (boardsarray[1][0] == 0 && boardsarray[1][1] == 0 && boardsarray[1][2] == 0) {
                result("won  : " + textview2);
                b10.setBackground(getResources().getDrawable(R.drawable.cell));
                b11.setBackground(getResources().getDrawable(R.drawable.cell));
                b12.setBackground(getResources().getDrawable(R.drawable.cell));
                break;

            } else if (boardsarray[2][0] == 1 && boardsarray[2][1] == 1 && boardsarray[2][2] == 1) {
                result("won  : " + textview1);
                b20.setBackground(getResources().getDrawable(R.drawable.cell));
                b21.setBackground(getResources().getDrawable(R.drawable.cell));
                b22.setBackground(getResources().getDrawable(R.drawable.cell));
                break;

            } else if (boardsarray[2][0] == 0 && boardsarray[2][1] == 0 && boardsarray[2][2] == 0) {
                result("won  : " + textview2);
                b20.setBackground(getResources().getDrawable(R.drawable.cell));
                b21.setBackground(getResources().getDrawable(R.drawable.cell));
                b22.setBackground(getResources().getDrawable(R.drawable.cell));
                break;

            }
        }
        for (int i = 0; i < 3; i++) {
            if (boardsarray[0][0] == 1 && boardsarray[1][0] == 1 && boardsarray[2][0] == 1) {
                result("won  : " + textview1);
                b00.setBackground(getResources().getDrawable(R.drawable.combined));
                b10.setBackground(getResources().getDrawable(R.drawable.combined));
                b20.setBackground(getResources().getDrawable(R.drawable.combined));
                break;
            } else if (boardsarray[0][0] == 0 && boardsarray[1][0] == 0 && boardsarray[2][0] == 0) {
                result("won  : " + textview2);
                b00.setBackground(getResources().getDrawable(R.drawable.combined));
                b10.setBackground(getResources().getDrawable(R.drawable.combined));
                b20.setBackground(getResources().getDrawable(R.drawable.combined));
                break;
            } else if (boardsarray[0][1] == 1 && boardsarray[1][1] == 1 && boardsarray[2][1] == 1) {
                result("won  : " + textview1);
                b01.setBackground(getResources().getDrawable(R.drawable.combined));
                b11.setBackground(getResources().getDrawable(R.drawable.combined));
                b21.setBackground(getResources().getDrawable(R.drawable.combined));
                break;
            } else if (boardsarray[0][1] == 0 && boardsarray[1][1] == 0 && boardsarray[2][1] == 0) {
                result("won  : " + textview2);
                b01.setBackground(getResources().getDrawable(R.drawable.combined));
                b11.setBackground(getResources().getDrawable(R.drawable.combined));
                b21.setBackground(getResources().getDrawable(R.drawable.combined));
                break;
            } else if (boardsarray[0][2] == 1 && boardsarray[1][2] == 1 && boardsarray[2][2] == 1) {
                result("won  : " + textview1);
                b02.setBackground(getResources().getDrawable(R.drawable.combined));
                b12.setBackground(getResources().getDrawable(R.drawable.combined));
                b22.setBackground(getResources().getDrawable(R.drawable.combined));
                break;
            } else if (boardsarray[0][2] == 0 && boardsarray[1][2] == 0 && boardsarray[2][2] == 0) {
                result("won  : " + textview2);
                b02.setBackground(getResources().getDrawable(R.drawable.combined));
                b12.setBackground(getResources().getDrawable(R.drawable.combined));
                b22.setBackground(getResources().getDrawable(R.drawable.combined));
                break;
            }


        }

        for (int i = 0; i < 3; i++) {

            if (boardsarray[0][0] == 1 && boardsarray[1][1] == 1 && boardsarray[2][2] == 1) {
                result("Won   : " + textview1);
                b00.setBackground(getResources().getDrawable(R.drawable.diagonal));
                b11.setBackground(getResources().getDrawable(R.drawable.diagonal));
                b22.setBackground(getResources().getDrawable(R.drawable.diagonal));
                break;

            } else if (boardsarray[0][0] == 0 && boardsarray[1][1] == 0 && boardsarray[2][2] == 0) {
                result("won  :" + textview2);
                b00.setBackground(getResources().getDrawable(R.drawable.diagonal));
                b11.setBackground(getResources().getDrawable(R.drawable.diagonal));
                b22.setBackground(getResources().getDrawable(R.drawable.diagonal));
                break;
            }

            if (boardsarray[0][2] == 1 && boardsarray[1][1] == 1 && boardsarray[2][0] == 1) {

                result("Won  :" + textview1);
                b02.setBackground(getResources().getDrawable(R.drawable.rightdiagonal));
                b11.setBackground(getResources().getDrawable(R.drawable.rightdiagonal));
                b20.setBackground(getResources().getDrawable(R.drawable.rightdiagonal));
                break;
            } else if (boardsarray[0][2] == 0 && boardsarray[1][1] == 0 && boardsarray[2][0] == 0) {
                result("Won :" + textview2);
                b02.setBackground(getResources().getDrawable(R.drawable.rightdiagonal));
                b11.setBackground(getResources().getDrawable(R.drawable.rightdiagonal));
                b20.setBackground(getResources().getDrawable(R.drawable.rightdiagonal));
                break;
            }
        }
    }



    private void setInfo(String text) {
        tvinfo.setText(text);
    }

    private void enablebox(boolean value) {

        b00.setEnabled(value);
        b01.setEnabled(value);
        b02.setEnabled(value);

        b10.setEnabled(value);
        b11.setEnabled(value);
        b12.setEnabled(value);

        b20.setEnabled(value);
        b21.setEnabled(value);
        b22.setEnabled(value);

        b00.setBackgroundResource(R.drawable.shape);
        b01.setBackgroundResource(R.drawable.shape);
        b02.setBackgroundResource(R.drawable.shape);

        b10.setBackgroundResource(R.drawable.shape);
        b11.setBackgroundResource(R.drawable.shape);
        b12.setBackgroundResource(R.drawable.shape);

        b20.setBackgroundResource(R.drawable.shape);
        b21.setBackgroundResource(R.drawable.shape);
        b22.setBackgroundResource(R.drawable.shape);

    }

    private void initializeboardsarray() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardsarray[i][j] = -1;
            }
        }
    }

private void c9(){



        }
}
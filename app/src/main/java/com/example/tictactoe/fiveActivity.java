package com.example.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fiveActivity extends AppCompatActivity implements View.OnClickListener {
    int TURNCOUNT = 0;

    TextView textview9;
    TextView textView18;
    String textview1;
    String textview2;

    Button b00;
    Button b01;
    Button b02, b03, b04;

    Button b10;
    Button b11;
    Button b12, b13, b14;

    Button b20;
    Button b21;
    Button b22, b23, b24, b30, b31, b32, b33, b34;
    Button b40, b41, b42, b43, b44;

    int[][] boardsarray = new int[5][5];
    boolean Player_x = true;
    TextView tvinfo;

    Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        textview9 = findViewById(R.id.pl1);
        textView18 = findViewById(R.id.pl2);
        tvinfo = findViewById(R.id.info);

        b00 = findViewById(R.id.b00);
        b01 = findViewById(R.id.b01);
        b02 = findViewById(R.id.b02);
        b03 = findViewById(R.id.b03);
        b04 = findViewById(R.id.b04);

        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b14 = findViewById(R.id.b14);

        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        b24 = findViewById(R.id.b24);

        b30 = findViewById(R.id.b30);
        b31 = findViewById(R.id.b31);
        b32 = findViewById(R.id.b32);
        b33 = findViewById(R.id.b33);
        b34 = findViewById(R.id.b34);

        b40 = findViewById(R.id.b40);
        b41 = findViewById(R.id.b41);
        b42 = findViewById(R.id.b42);
        b43 = findViewById(R.id.b43);
        b44 = findViewById(R.id.b44);

        reset = findViewById(R.id.rst9);
        String ab = getIntent().getStringExtra("Player1");
        String cd = getIntent().getStringExtra("Player2");

        textview9.setText(ab);
        textView18.setText(cd);

        b00.setOnClickListener(this);
        b01.setOnClickListener(this);
        b02.setOnClickListener(this);
        b03.setOnClickListener(this);
        b04.setOnClickListener(this);

        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);

        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);

        b30.setOnClickListener(this);
        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b34.setOnClickListener(this);

        b40.setOnClickListener(this);
        b41.setOnClickListener(this);
        b42.setOnClickListener(this);
        b43.setOnClickListener(this);
        b44.setOnClickListener(this);

        b00.setBackground(getResources().getDrawable(R.drawable.shape));
        b01.setBackground(getResources().getDrawable(R.drawable.shape));
        b02.setBackground(getResources().getDrawable(R.drawable.shape));
        b03.setBackground(getResources().getDrawable(R.drawable.shape));
        b04.setBackground(getResources().getDrawable(R.drawable.shape));


        b10.setBackground(getResources().getDrawable(R.drawable.shape));
        b11.setBackground(getResources().getDrawable(R.drawable.shape));
        b12.setBackground(getResources().getDrawable(R.drawable.shape));
        b13.setBackground(getResources().getDrawable(R.drawable.shape));
        b14.setBackground(getResources().getDrawable(R.drawable.shape));

        b20.setBackground(getResources().getDrawable(R.drawable.shape));
        b21.setBackground(getResources().getDrawable(R.drawable.shape));
        b22.setBackground(getResources().getDrawable(R.drawable.shape));
        b23.setBackground(getResources().getDrawable(R.drawable.shape));
        b24.setBackground(getResources().getDrawable(R.drawable.shape));

        b30.setBackground(getResources().getDrawable(R.drawable.shape));
        b31.setBackground(getResources().getDrawable(R.drawable.shape));
        b32.setBackground(getResources().getDrawable(R.drawable.shape));
        b33.setBackground(getResources().getDrawable(R.drawable.shape));
        b34.setBackground(getResources().getDrawable(R.drawable.shape));

        b40.setBackground(getResources().getDrawable(R.drawable.shape));
        b41.setBackground(getResources().getDrawable(R.drawable.shape));
        b42.setBackground(getResources().getDrawable(R.drawable.shape));
        b43.setBackground(getResources().getDrawable(R.drawable.shape));
        b44.setBackground(getResources().getDrawable(R.drawable.shape));

        reset.setOnClickListener(this);

        initializeboardsarray();


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
            case R.id.b03:
                if (Player_x) {
                    b03.setText("X");
                    boardsarray[0][3] = 1;
                } else {
                    b03.setText("O");
                    boardsarray[0][3] = 0;
                }
                b03.setEnabled(false);
                break;

            case R.id.b04:
                if (Player_x) {
                    b04.setText("X");
                    boardsarray[0][4] = 1;
                } else {
                    b04.setText("O");
                    boardsarray[0][4] = 0;
                }
                b04.setEnabled(false);
                break;


            case R.id.b10:
                if (Player_x) {
                    b10.setText("X");
                    boardsarray[1][0] = 1;
                } else {
                    b10.setText("O");
                    boardsarray[1][0] = 0;
                }
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
            case R.id.b13:
                if (Player_x) {
                    b13.setText("X");
                    boardsarray[1][3] = 1;
                } else {
                    b13.setText("O");
                    boardsarray[1][3] = 0;
                }
                b13.setEnabled(false);
                break;

            case R.id.b14:
                if (Player_x) {
                    b14.setText("X");
                    boardsarray[1][4] = 1;
                } else {
                    b14.setText("O");
                    boardsarray[1][4] = 0;
                }
                b14.setEnabled(false);
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
            case R.id.b23:
                if (Player_x) {
                    b23.setText("X");
                    boardsarray[2][3] = 1;
                } else {
                    b23.setText("O");
                    boardsarray[2][3] = 0;
                }
                b23.setEnabled(false);
                break;

            case R.id.b24:
                if (Player_x) {
                    b24.setText("X");
                    boardsarray[2][4] = 1;
                } else {
                    b24.setText("O");
                    boardsarray[2][4] = 0;
                }
                b24.setEnabled(false);
                break;

            case R.id.b30:
                if (Player_x) {
                    b30.setText("X");
                    boardsarray[3][0] = 1;
                } else {
                    b30.setText("O");
                    boardsarray[3][0] = 0;
                }
                b30.setEnabled(false);
                break;

            case R.id.b31:
                if (Player_x) {
                    b31.setText("X");
                    boardsarray[3][1] = 1;
                } else {
                    b31.setText("O");
                    boardsarray[3][1] = 0;
                }
                b31.setEnabled(false);
                break;

            case R.id.b32:
                if (Player_x) {
                    b32.setText("X");
                    boardsarray[3][2] = 1;
                } else {
                    b32.setText("O");
                    boardsarray[3][2] = 0;
                }
                b32.setEnabled(false);
                break;

            case R.id.b33:
                if (Player_x) {
                    b33.setText("X");
                    boardsarray[3][3] = 1;
                } else {
                    b33.setText("O");
                    boardsarray[3][3] = 0;
                }
                b33.setEnabled(false);
                break;

            case R.id.b34:
                if (Player_x) {
                    b34.setText("X");
                    boardsarray[3][4] = 1;
                } else {
                    b34.setText("O");
                    boardsarray[3][4] = 0;
                }
                b34.setEnabled(false);
                break;

            case R.id.b40:
                if (Player_x) {
                    b40.setText("X");
                    boardsarray[4][0] = 1;
                } else {
                    b40.setText("O");
                    boardsarray[4][0] = 0;
                }
                b40.setEnabled(false);
                break;
            case R.id.b41:
                if (Player_x) {
                    b41.setText("X");
                    boardsarray[4][1] = 1;
                } else {
                    b41.setText("O");
                    boardsarray[4][1] = 0;
                }
                b41.setEnabled(false);
                break;

            case R.id.b42:
                if (Player_x) {
                    b42.setText("X");
                    boardsarray[4][2] = 1;
                } else {
                    b42.setText("O");
                    boardsarray[4][2] = 0;
                }
                b42.setEnabled(false);
                break;

            case R.id.b43:
                if (Player_x) {
                    b43.setText("X");
                    boardsarray[4][3] = 1;
                } else {
                    b43.setText("O");
                    boardsarray[4][3] = 0;
                }
                b43.setEnabled(false);
                break;

            case R.id.b44:
                if (Player_x) {
                    b44.setText("X");
                    boardsarray[4][4] = 1;
                } else {
                    b44.setText("O");
                    boardsarray[4][4] = 0;
                }
                b44.setEnabled(false);
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

            if (TURNCOUNT == 25) {
                result("Game Draw");
            }

            checkwinner();
        }

    }

    private void result(String winner) {
        setInfo(winner);
        enablebox(false);

    }

    private void setInfo(String text) {
        tvinfo.setText(text);
    }

    private void onreset() {

        b00.setText("");
        b01.setText("");
        b02.setText("");
        b03.setText("");
        b04.setText("");

        b10.setText("");
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b14.setText("");

        b20.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b24.setText("");

        b30.setText("");
        b31.setText("");
        b32.setText("");
        b33.setText("");
        b34.setText("");

        b40.setText("");
        b41.setText("");
        b42.setText("");
        b43.setText("");
        b44.setText("");


        TURNCOUNT = 0;
        Player_x = true;
        enablebox(true);
        TURNCOUNT++;
        initializeboardsarray();

        tvinfo.setText("");

    }

    private void enablebox(boolean value) {

        b00.setEnabled(value);
        b01.setEnabled(value);
        b02.setEnabled(value);
        b03.setEnabled(value);
        b04.setEnabled(value);

        b10.setEnabled(value);
        b11.setEnabled(value);
        b12.setEnabled(value);
        b13.setEnabled(value);
        b14.setEnabled(value);

        b20.setEnabled(value);
        b21.setEnabled(value);
        b22.setEnabled(value);
        b23.setEnabled(value);
        b24.setEnabled(value);

        b30.setEnabled(value);
        b31.setEnabled(value);
        b32.setEnabled(value);
        b33.setEnabled(value);
        b34.setEnabled(value);

        b40.setEnabled(value);
        b41.setEnabled(value);
        b42.setEnabled(value);
        b43.setEnabled(value);
        b44.setEnabled(value);

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
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                boardsarray[i][j] = -1;
            }
        }
    }

    private void checkwinner() {
        //Horizontal
        for (int i = 0; i < 5; i++) {
            if (boardsarray[i][0] == boardsarray[i][1] && boardsarray[i][0] == boardsarray[i][2]&& boardsarray[i][0]==boardsarray[i][3] ) {
                if (boardsarray[i][0] == 1) {
                    result("Won :" + textview1);

                } else if (boardsarray[i][0] == 0) {
                    result("Won :" + textview2);
                }

            }
            if( boardsarray[i][1]==boardsarray[i][2]
                    && boardsarray[i][1]==boardsarray[i][3]&& boardsarray[i][1]==boardsarray[i][4]){
                if (boardsarray[i][1] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[i][1] == 0) {
                    result("Won :" + textview2);
                }
            }

        }
        //Vertical
        for (int i = 0; i < 5; i++) {
            if (boardsarray[0][i] == boardsarray[1][i] && boardsarray[0][i] == boardsarray[2][i]&& boardsarray[0][i]==boardsarray[3][i] ) {
                if (boardsarray[0][i] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[0][i] == 0) {
                    result("Won :" + textview2);
                }
            }
            if( boardsarray[1][i]==boardsarray[2][i]
                    && boardsarray[1][i]==boardsarray[3][i]&& boardsarray[1][i]==boardsarray[4][i]){
                if (boardsarray[1][i] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[1][i] == 0) {
                    result("Won :" + textview2);
                }
            }

        }
        //Diagonal
        for (int i = 0; i < 5; i++) {
            if (boardsarray[0][0] == boardsarray[1][1] && boardsarray[0][0] == boardsarray[2][2]&& boardsarray[0][0]==boardsarray[3][3] ) {
                if (boardsarray[0][0] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[0][0] == 0) {
                    result("Won :" + textview2);
                }
            }
            if( boardsarray[1][1]==boardsarray[2][2]
                    && boardsarray[1][1]==boardsarray[3][3]&& boardsarray[1][1]==boardsarray[4][4]){
                if (boardsarray[1][1] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[1][1] == 0) {
                    result("Won :" + textview2);
                }
            }
            if (boardsarray[0][4] == boardsarray[1][3] && boardsarray[0][4] == boardsarray[2][2]&& boardsarray[0][4]==boardsarray[3][1] ) {
                if (boardsarray[0][4] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[0][4] == 0) {
                    result("Won :" + textview2);
                }
            }
            if( boardsarray[1][3]==boardsarray[2][2]
                    && boardsarray[1][3]==boardsarray[3][1]&& boardsarray[1][3]==boardsarray[4][0]){
                if (boardsarray[1][3] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[1][3] == 0) {
                    result("Won :" + textview2);
                }
            }

            if (boardsarray[0][0] == boardsarray[1][1] && boardsarray[0][0] == boardsarray[2][2]&& boardsarray[0][0]==boardsarray[3][3] ) {
                if (boardsarray[0][0] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[0][0] == 0) {
                    result("Won :" + textview2);
                }
            }
            if( boardsarray[0][1]==boardsarray[1][2]
                    && boardsarray[0][1]==boardsarray[2][3]&& boardsarray[0][1]==boardsarray[3][4]){
                if (boardsarray[0][1] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[0][1] == 0) {
                    result("Won :" + textview2);
                }
            }

            if (boardsarray[0][0] == boardsarray[1][1] && boardsarray[0][0] == boardsarray[2][2]&& boardsarray[0][0]==boardsarray[3][3] ) {
                if (boardsarray[0][0] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[0][0] == 0) {
                    result("Won :" + textview2);
                }
            }
            if( boardsarray[0][3]==boardsarray[1][2]
                    && boardsarray[0][3]==boardsarray[2][1]&& boardsarray[0][3]==boardsarray[3][0]){
                if (boardsarray[0][3] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[0][3] == 0) {
                    result("Won :" + textview2);
                }
            }
            if (boardsarray[0][0] == boardsarray[1][1] && boardsarray[0][0] == boardsarray[2][2]&& boardsarray[0][0]==boardsarray[3][3] ) {
                if (boardsarray[0][0] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[0][0] == 0) {
                    result("Won :" + textview2);
                }
            }
            if( boardsarray[1][0]==boardsarray[2][1]
                    && boardsarray[1][0]==boardsarray[3][2]&& boardsarray[1][0]==boardsarray[4][3]){
                if (boardsarray[1][0] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[1][0] == 0) {
                    result("Won :" + textview2);
                }
            }
            if (boardsarray[0][0] == boardsarray[1][1] && boardsarray[0][0] == boardsarray[2][2]&& boardsarray[0][0]==boardsarray[3][3] ) {
                if (boardsarray[0][0] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[0][0] == 0) {
                    result("Won :" + textview2);
                }
            }
            if( boardsarray[1][4]==boardsarray[2][3]
                    && boardsarray[1][4]==boardsarray[3][2]&& boardsarray[1][4]==boardsarray[4][1]){
                    if (boardsarray[1][4] == 1) {
                    result("Won :" + textview1);
                } else if (boardsarray[1][4] == 0) {
                    result("Won :" + textview2);
                }
            }

        }


    }
}
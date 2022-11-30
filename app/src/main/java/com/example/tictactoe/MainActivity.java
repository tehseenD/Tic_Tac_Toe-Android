package com.example.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtext9;
    EditText edtext18;
    Button button9;
    String ab,cd;
    int[][] boardsarray = new int [3][3];
    Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtext9 = findViewById(R.id.tv9);
        edtext18 = findViewById(R.id.tv18);
        button9 = findViewById(R.id.btn9);
        button=findViewById(R.id.three);
        button2 = findViewById(R.id.five);




        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ab = edtext9.getText().toString();
                cd = edtext18.getText().toString();

                Intent i = new Intent(MainActivity.this,Main2Activity.class);

                i.putExtra("Player1",ab);
                i.putExtra("Player2",cd);
                startActivity(i);

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ab = edtext9.getText().toString();
                cd = edtext18.getText().toString();
                Intent ii = new Intent(MainActivity.this,Main2Activity.class);
                ii.putExtra("Player1",ab);
                ii.putExtra("Player2",cd);
                startActivity(ii);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ab = edtext9.getText().toString();
                cd = edtext18.getText().toString();
                Intent i9 = new Intent(MainActivity.this , fiveActivity.class);
                i9.putExtra("Player1",ab);
                i9.putExtra("Player2",cd);
                startActivity(i9);
            }
        });

    }


}

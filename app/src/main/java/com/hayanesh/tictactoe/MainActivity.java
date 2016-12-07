package com.hayanesh.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button[] buttons = new Button[9];
    public int flag = 0;
    String MARK = "X";
    Board b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = new Board();

        buttons[0] = (Button) findViewById(R.id.b1);
        buttons[1] = (Button) findViewById(R.id.b2);
        buttons[2] = (Button) findViewById(R.id.b3);
        buttons[3] = (Button) findViewById(R.id.b4);
        buttons[4] = (Button) findViewById(R.id.b5);
        buttons[5] = (Button) findViewById(R.id.b6);
        buttons[6] = (Button) findViewById(R.id.b7);
        buttons[7] = (Button) findViewById(R.id.b8);
        buttons[8] = (Button) findViewById(R.id.b9);

            buttons[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttons[0].setText(MARK);
                    buttons[0].setClickable(false);
                    Points userMove = new Points(0, 0);
                    b.placeAMove(userMove, 2);
                    if (MARK.equals("X"))
                        MARK = "O";
                    else
                        MARK = "X";

                    if (b.isGameOver()) {
                        MatchStatus();
                    }
                    b.callMinimax(0, 1);
                    b.placeAMove(b.returnBestPoint(), 1);
                    MarkButton(b.returnBestPoint());
                }
            });

            buttons[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttons[1].setText(MARK);
                    buttons[1].setClickable(false);
                    Points userMove = new Points(0, 1);
                    b.placeAMove(userMove, 2);
                    if (MARK.equals("X"))
                        MARK = "O";
                    else
                        MARK = "X";

                    if (b.isGameOver()) {
                        MatchStatus();
                    }
                    b.callMinimax(0, 1);
                    b.placeAMove(b.returnBestPoint(), 1);
                    MarkButton(b.returnBestPoint());
                }
            });

            buttons[2].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttons[2].setText(MARK);
                    buttons[2].setClickable(false);
                    Points userMove = new Points(0, 2);
                    b.placeAMove(userMove, 2);
                    if (MARK.equals("X"))
                        MARK = "O";
                    else
                        MARK = "X";

                    if (b.isGameOver()) {
                        MatchStatus();
                    }
                    b.callMinimax(0, 1);
                    b.placeAMove(b.returnBestPoint(), 1);
                    MarkButton(b.returnBestPoint());
                }
            });

            buttons[3].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttons[3].setText(MARK);
                    buttons[3].setClickable(false);
                    Points userMove = new Points(1, 0);
                    b.placeAMove(userMove, 2);
                    if (MARK.equals("X"))
                        MARK = "O";
                    else
                        MARK = "X";

                    if (b.isGameOver()) {
                        MatchStatus();
                    }
                    b.callMinimax(0, 1);
                    b.placeAMove(b.returnBestPoint(), 1);
                    MarkButton(b.returnBestPoint());
                }
            });

            buttons[4].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttons[4].setText(MARK);
                    buttons[4].setClickable(false);
                    Points userMove = new Points(1, 1);
                    b.placeAMove(userMove, 2);
                    if (MARK.equals("X"))
                        MARK = "O";
                    else
                        MARK = "X";

                    if (b.isGameOver()) {
                        MatchStatus();
                    }
                    b.callMinimax(0, 1);
                    b.placeAMove(b.returnBestPoint(), 1);
                    MarkButton(b.returnBestPoint());
                }
            });


            buttons[5].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttons[5].setText(MARK);
                    buttons[5].setClickable(false);
                    Points userMove = new Points(1, 2);
                    b.placeAMove(userMove, 2);
                    if (MARK.equals("X"))
                        MARK = "O";
                    else
                        MARK = "X";

                    if (b.isGameOver()) {
                        MatchStatus();
                    }
                    b.callMinimax(0, 1);
                    b.placeAMove(b.returnBestPoint(), 1);
                    MarkButton(b.returnBestPoint());
                }
            });


            buttons[6].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttons[6].setText(MARK);
                    buttons[6].setClickable(false);
                    Points userMove = new Points(2, 0);
                    b.placeAMove(userMove, 2);
                    if (MARK.equals("X"))
                        MARK = "O";
                    else
                        MARK = "X";

                    if (b.isGameOver()) {
                        MatchStatus();
                    }
                    b.callMinimax(0, 1);
                    b.placeAMove(b.returnBestPoint(), 1);
                    MarkButton(b.returnBestPoint());
                }
            });


            buttons[7].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttons[7].setText(MARK);
                    buttons[7].setClickable(false);
                    Points userMove = new Points(2, 1);
                    b.placeAMove(userMove, 2);
                    if (MARK.equals("X"))
                        MARK = "O";
                    else
                        MARK = "X";

                    if (b.isGameOver()) {
                        MatchStatus();
                    }
                    b.callMinimax(0, 1);
                    b.placeAMove(b.returnBestPoint(), 1);
                    MarkButton(b.returnBestPoint());
                }
            });

            buttons[8].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttons[8].setText(MARK);
                    buttons[8].setClickable(false);
                    Points userMove = new Points(2, 2);
                    b.placeAMove(userMove, 2);
                    if (MARK.equals("X"))
                        MARK = "O";
                    else
                        MARK = "X";

                    if (b.isGameOver()) {
                        MatchStatus();
                    }
                    b.callMinimax(0, 1);
                    b.placeAMove(b.returnBestPoint(), 1);
                    MarkButton(b.returnBestPoint());
                }
            });
    }

    public void MatchStatus()
    {
        if(b.hasWon(1))
            Toast.makeText(this, "You Lost..", Toast.LENGTH_SHORT).show();
        else if(b.hasWon(2))
            Toast.makeText(this, "You Won", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Match Draw", Toast.LENGTH_SHORT).show();
    }

    public void ToggleMark(String mark)
    {
        if(mark.equals("X"))
            MARK =  "O";
        else
            MARK = "X";
    }
    public void MarkButton(Points point)
    {
        int x = point.x;
        int y = point.y;

        switch (x)
        {
            case 0:
                    {
                        switch (y)
                        {
                            case 0: buttons[0].setText(MARK);
                                ToggleMark(MARK);
                                buttons[0].setClickable(false);
                                break;
                            case 1: buttons[1].setText(MARK);
                                ToggleMark(MARK);
                                buttons[1].setClickable(false);
                                break;
                            case 2: buttons[2].setText(MARK);
                                ToggleMark(MARK);
                                buttons[2].setClickable(false);
                                break;
                        }

                    }
                    break;
            case 1:
            {
                switch (y)
                {
                    case 0: buttons[3].setText(MARK);
                        ToggleMark(MARK);
                        buttons[3].setClickable(false);
                        break;
                    case 1: buttons[4].setText(MARK);
                        ToggleMark(MARK);
                        buttons[4].setClickable(false);
                        break;
                    case 2: buttons[5].setText(MARK);
                        ToggleMark(MARK);
                        buttons[5].setClickable(false);
                        break;
                }

            }
            break;

            case 2:
            {
                switch (y)
                {
                    case 0: buttons[6].setText(MARK);
                        ToggleMark(MARK);
                        buttons[6].setClickable(false);
                        break;
                    case 1: buttons[7].setText(MARK);
                        ToggleMark(MARK);
                        buttons[7].setClickable(false);
                        break;
                    case 2: buttons[8].setText(MARK);
                        ToggleMark(MARK);
                        buttons[8].setClickable(false);
                        break;
                }

            }
            break;
        }
    }

}
package com.hayanesh.tictactoe;

/**
 * Created by Hayanesh on 11-Sep-16.
 */
public class Points {
    int x;
    int y;
    public Points(int x, int y){
        this.x =x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "["+x+","+y+"]";
    }
}

package com.hayanesh.tictactoe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hayanesh on 11-Sep-16.
 */
public class Board {
    List<Points> availablePoints;

    int[][] board = new int[3][3];
    public Board(){
        for(int i=0;i<3;i++)
            for (int j=0;j<3;j++)
                board[i][j]=0;
    }

    public boolean hasWon(int player)
    {
        //Checking diagonal
        if((board[0][0]==board[1][1] && board[0][0]==board[2][2] && board[0][0]==player)
                || (board[0][2]==board[1][1] && board[0][2]==board[2][0] && board[0][2]==player))
        {
            return true;
        }
        //checking row and column
        for(int i=0;i<3;i++)
        {
            if((board[i][0] == board[i][1] && board[i][1]==board[i][2] && board[i][0]==player)
                ||(board[0][i]==board[1][i] && board[1][i]==board[2][i] && board[0][i]==player))
            {
                return true;
            }
        }
        return false;
    }

    public List<Points> getAvailablePoints()
    {
        availablePoints = new ArrayList<>();
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(board[i][j]==0)
                    availablePoints.add(new Points(i,j));

        return availablePoints;
    }

    public boolean isGameOver()
    {
        return hasWon(1)||hasWon(2)||getAvailablePoints().isEmpty();
    }

    public void placeAMove(Points points,int player)
    {
        board[points.x][points.y]=player;
    }

    public int returnMax(List<Integer> list)
    {
        int MAX = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(list.get(i)>MAX) {
                MAX = list.get(i);
                index = i;
            }
        return list.get(index);
    }
    public int returnMin(List<Integer> list)
    {
        int MIN = Integer.MAX_VALUE;
        int index = -1;
        for(int i =0;i<list.size();i++)
        {
            if(list.get(i) < MIN) {
                MIN = list.get(i);
                index = i;
            }
        }
        return list.get(index);
    }

    public Points returnBestPoint()
    {
        int MAX = -10000;
        int index = 0;
            for (int i = 0; i < rootsChildernScores.size(); i++)
                if (rootsChildernScores.get(i).score > MAX) {
                    MAX = rootsChildernScores.get(i).score;
                    index = i;
                }
            return rootsChildernScores.get(index).points;
    }
    List<PointsAndScores> rootsChildernScores;

    public void callMinimax(int depth, int turn){
        rootsChildernScores = new ArrayList<>();
        minmax(depth, turn);
    }

    public int minmax(int depth,int player)
    {
        if(hasWon(1)) return +1;
        if(hasWon(2)) return -1;

        List<Points> pointAvailable = getAvailablePoints();
        if(pointAvailable.isEmpty()) return 0;

        List<Integer> scores = new ArrayList<>();

        for(int i =0;i<pointAvailable.size();i++)
        {
            Points points = getAvailablePoints().get(i);
            if(player==1)
            {
                placeAMove(points,1);
                int currentScore = minmax(depth+1,2);
                scores.add(currentScore);

                if(depth==0)
                    rootsChildernScores.add(new PointsAndScores(currentScore,points));

            }else if(player==2)
            {
                placeAMove(points,2);
                int currentScore = minmax(depth+1,1);
                scores.add(currentScore);
            }
            board[points.x][points.y] = 0;
        }
        return player==1?returnMax(scores):returnMin(scores);
    }
}

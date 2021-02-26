package com.gokul.chapter3.gamescore;

import java.util.Arrays;

public class ScoreBoard {
    private int numEntries=0;
    private GameEntry[] board;


//    constructs a new board with given capacity
    public ScoreBoard(int capacity){
        board=new GameEntry[capacity];
    }

//    attempts to add a new score to the collection if it is greater than all the high scores

    public void add(GameEntry e){
        int newScore=e.getScore();
//        is the new entry a really high score
        if(numEntries<board.length||newScore>board[numEntries-1].getScore()){
            if(numEntries<board.length)
                numEntries++;
            int j=numEntries-1;
            while(j>0&&board[j-1].getScore()<newScore){
                board[j]=board[j-1];
                j--;
            }
            board[j]=e;
        }


    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException{
        if(i<0||i>numEntries)
            throw new IndexOutOfBoundsException("Invalid index: "+i);
        GameEntry temp=board[i];
        for(int j=i;j<numEntries-1;j++){
            board[j]=board[j+1];
        }
        board[numEntries-1]=null;
        numEntries--;
        return temp;

    }

    @Override
    public String toString() {
        return "ScoreBoard{" +
                "board=" + Arrays.toString(board) +
                '}';
    }


}

package com.gokul.chapter3.gamescore;

public class GameScoreImpl {

    public static void main(String[] args) {

//        craete 3 people playing game
        GameEntry[]players=new GameEntry[5];
        players[0]=new GameEntry("Julian",10);
        players[1]=new GameEntry("Roman",15);
        players[2]=new GameEntry("Michael",3);
        players[3]=new GameEntry("Kamila",16);
        players[4]=new GameEntry("Rakish",8);


//        scoreboard with capacity 5
        ScoreBoard sb1;
        sb1=new ScoreBoard(5);
        for(GameEntry player:players){
            sb1.add(player);
        }
        System.out.println(sb1.toString());;

//        update a value
        players[4]=new GameEntry("Rakish",30);
        for(GameEntry player:players){
            sb1.add(player);
        }
//        get the result with updated value
        System.out.println(sb1.toString());



    }
}

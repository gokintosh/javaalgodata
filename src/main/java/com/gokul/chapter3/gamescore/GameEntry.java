package com.gokul.chapter3.gamescore;

public class GameEntry {

    private String name;
    private int score;

//    constructs a game entry with given parameters

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }


//    return the name field
    public String getName(){
        return name;
    }
//    return the score
    public int getScore(){
        return score;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

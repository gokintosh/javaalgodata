package com.gokul.chapter2.progression;

public class Progression {
//    instance variable
    protected long current;

//    default constructor to construct a progression starting from 0
    public Progression() {
        this(0);
    }

//    constructs a progression starting from the current value

    public Progression(long current) {
        this.current = current;
    }

//    return next value of progression
    public long nextValue(){
        long answer=current;
        advance();
        return answer;
    }

//    advance the current value to the next value in progression
    protected void advance(){
        current++;
    }

//    prints the n values in a progression separated by space
    public void printProgression(int n){
        for(int i=0;i<n;i++)
            System.out.print(" "+nextValue());
        System.out.println();
    }
}

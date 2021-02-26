package com.gokul.chapter2.progression;

public class ArithmeticProgression extends Progression {

    protected long increment;

//    constructs a progression 0,1,2,3...
    public ArithmeticProgression(){
        this(1,0);
    }
//    construct a progression 0,stepsize ,2*stepsize
    public ArithmeticProgression(long stepSize){
        this(stepSize,0);
    }

//    constructs arithmetic progression with step size and current
    public ArithmeticProgression(long stepSize,long current){
        super(current);
        increment=stepSize;
    }

//    overriding advance from super class
    protected void advance(){
        current+=increment;
    }
}

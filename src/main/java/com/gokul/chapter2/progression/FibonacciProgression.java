package com.gokul.chapter2.progression;

public class FibonacciProgression extends Progression{
    protected long prev;


//    constructs traditonal
    public FibonacciProgression(){
        this(0,1);
    }

//    construct generalised fibbonacci series with given second and first value

    public FibonacciProgression(long first,long second){
        super(first);
        prev=second-first;
    }

    protected void advance(){
        long temp=prev;
        prev=current;
        current+=temp;
    }
}

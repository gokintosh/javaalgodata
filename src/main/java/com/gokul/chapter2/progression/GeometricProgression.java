package com.gokul.chapter2.progression;

public class GeometricProgression extends Progression{
    protected long base;


//    constructs a progression 1,2,4,6,.

    public GeometricProgression() {
        this(2,1);
    }

//    constructs a progression from 1 with base b

    public GeometricProgression(long base) {
        this(base,1);
    }

    public GeometricProgression(long base, long current) {
        super(current);
        this.base = base;
    }

    protected void advance(){
        current*=base;
    }
}

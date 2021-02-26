package com.gokul.chapter2.progression;

public class ProgressionImpl {

    public static void main(String[] args) {
        Progression prog;

//        test arithmetic progression
        System.out.println("Arithmetic progression with default increment");
        prog=new ArithmeticProgression();
        prog.printProgression(10);
        System.out.println("Arithmetic progression of increment 10");
        prog=new ArithmeticProgression(10);
        prog.printProgression(10);
        System.out.println("Arithmetic progression of with start of 2");
        prog=new ArithmeticProgression(10,2);
        prog.printProgression(10);

//      test geometric progression
        System.out.println("Geometric progression with default base");
        prog=new GeometricProgression();
        prog.printProgression(10);
        System.out.println("Geometric progression with base 3");
        prog=new GeometricProgression(3);
        prog.printProgression(10);

//        test fibonacci progression
        System.out.println("fibonacci progression with default starter values");
        prog=new FibonacciProgression();
        prog.printProgression(10);
        System.out.println("fibonacci progression with starter values 4 nd 6");
        prog=new FibonacciProgression(4,6);
        prog.printProgression(10);

    }

}

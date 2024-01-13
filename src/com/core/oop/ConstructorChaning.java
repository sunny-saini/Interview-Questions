package com.core.oop;

public class ConstructorChaning {


    ConstructorChaning(){
     //   this(2);

        System.out.println("The Default Constructor");
    }

    public ConstructorChaning(int i) {

        this();
        System.out.println(i);
    }

    public ConstructorChaning(int i, int i1) {
        this(5);
        System.out.println(i*i1);
    }

    public static void main(String[] args) {
        new ConstructorChaning();
    }
}

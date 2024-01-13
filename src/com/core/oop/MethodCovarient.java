package com.core.oop;

public class MethodCovarient {

    public RuntimeException getName(){
        System.out.println("Sunny");
        return new RuntimeException();
    }
}

class Child extends MethodCovarient{

    @Override
    public RuntimeException getName(){
        System.out.println("Saini");
        return null;
    }
}

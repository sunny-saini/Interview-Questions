package com.core.design.pattern;

public class Singleton {
    private static Singleton singleton;


    private Singleton(){}

    public static  Singleton getInstance(){
        if (singleton==null){
            singleton= new Singleton();
        }
        return singleton;
    }

    public static  Singleton getInstanc(){
        if (singleton==null){
            synchronized (Singleton.class) {
                if (singleton==null)
                singleton = new Singleton();
            }
        }
        return singleton;
    }

}

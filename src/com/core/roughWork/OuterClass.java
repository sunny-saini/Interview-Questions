package com.core.roughWork;

public class OuterClass {


    public void run(){
        System.out.println("run calling");
    }

    class Innr {
        public void stop(){
            System.out.println("stop calling");
        }
    }
}
class Main1{
    public static void main(String[] args) {
        OuterClass.Innr a = new OuterClass().new Innr();
        a.stop();
    }
}
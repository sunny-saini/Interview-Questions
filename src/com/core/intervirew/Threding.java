package com.core.intervirew;

public class Threding implements Runnable{


    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("index value "+ i);
        }
        try {
            Thread.sleep(1000);
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Impl {
    public static void main(String[] args) {
        Threding thread= new Threding();
        Thread t= new Thread(thread);

        t.notify();

    }
}

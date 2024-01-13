package com.core.Mulththreading;

class T1 implements Runnable{

    @Override
    public void run() {

        for (int i=0;i<10;i++){
            System.out.println("T1");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class T2 implements Runnable{
    @Override
    public void run() {

        for (int i=0;i<10;i++){
            System.out.println("T2");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class PrintT1T2 {
    public static void main(String[] args) throws InterruptedException {

int i=0;
        T1 t1 = new T1();
       Thread  th= new Thread(t1);
       th.start();

     //  th.join();
        T2 t2 = new T2();
        Thread  th2= new Thread(t2);
        th2.start();
      //  th2.join();

    }
}

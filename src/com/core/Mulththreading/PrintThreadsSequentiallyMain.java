package com.core.Mulththreading;

public class PrintThreadsSequentiallyMain {
 
    public static void main(String[] args) {

        PrintSequence runnable1=new PrintSequence(1);
        PrintSequence runnable2=new PrintSequence(0);
      //  PrintSequenceRunnable runnable3=new PrintSequenceRunnable(0);
 
        Thread t1=new Thread(runnable1,"T1");
        Thread t2=new Thread(runnable2,"T2");
    //    Thread t3=new Thread(runnable3,"T3");
 
        t1.start();
        t2.start();
     //   t3.start();
    }
}
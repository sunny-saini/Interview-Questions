package com.core.Mulththreading;

public class PrintSequence implements Runnable {


    static int number = 1;
    static Object lock = new Object();
    private int reminder;

    PrintSequence(int reminder) {
        this.reminder = reminder;
    }

    @Override
    public void run() {
        while (number < 10) {
            synchronized (lock) {
                while (number % 2 != reminder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}

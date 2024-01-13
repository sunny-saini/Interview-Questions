package com.core.roughWork;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
BlockingQueue<Integer> shareQueue;

Producer(BlockingQueue<Integer> shareQueue){
    this.shareQueue=shareQueue;
}

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            try {
                System.out.println("produce "+i);
                shareQueue.put(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable{
     final BlockingQueue<Integer> shareValue;

     Consumer(BlockingQueue<Integer> shareValue){
         this.shareValue=shareValue;
     }


    @Override
    public void run() {
        while (true){
            try {
                int value= shareValue.take();

                System.out.println("consume "+ value);
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}




public class Main109 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        Thread producer= new Thread(new Producer(queue));
        Thread consumer= new Thread(new Consumer(queue));
        producer.start();
        consumer.start();
    }
}

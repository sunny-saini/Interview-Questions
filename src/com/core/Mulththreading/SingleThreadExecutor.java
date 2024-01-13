package com.core.Mulththreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingleThreadExecutor {

    ExecutorService executorService
            = Executors.newFixedThreadPool(1);
    public static void main(String[] args) {
      ExecutorService excute=Executors.newSingleThreadExecutor();
      excute.execute(new Task1());
      excute.execute(new Thread(new Task1()));


        ExecutorService executorService
                = Executors.newFixedThreadPool(1);


        Future obj
                = executorService.submit(new Callable() {

            // Overriding the call method
            public Object call()
            {
                System.out.println(
                        "This is submit() "
                                + "method example");

                return "Returning Callable "
                        + "Task Result";
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }



        // Overriding the call method

}

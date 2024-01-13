package com.core.Mulththreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ConcurrentMethodScheduler {

    public static void main(String[] args) {
        // Create a ScheduledExecutorService with a pool of three threads
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);

        // Schedule three tasks to be executed concurrently after an initial delay of 0 seconds
        executorService.schedule(() -> method1(), 0, TimeUnit.SECONDS);
        executorService.schedule(() -> method2(), 0, TimeUnit.SECONDS);
        executorService.schedule(() -> method3(), 0, TimeUnit.SECONDS);

        // Shutdown the executor after all tasks are completed
        executorService.shutdown();
    }

    private static void method1() {
        // Implementation of method 1
        System.out.println("Executing Method 1");
    }

    private static void method2() {
        // Implementation of method 2
        System.out.println("Executing Method 2");
    }

    private static void method3() {
        // Implementation of method 3
        System.out.println("Executing Method 3");
    }
}

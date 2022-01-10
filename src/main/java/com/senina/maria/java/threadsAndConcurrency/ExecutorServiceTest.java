package com.senina.maria.java.threadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
    private int number;

    public Task(int number) {
        this.number = number;
    }

    public void run() {    //exact signature
        System.out.print("\n Task " + number + " Started ");

        for(int i = number*100; i <= (number*100) + 99; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n Task " + number + " Done");
    }
}

public class ExecutorServiceTest {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        // ^ max 5 threads are active at any one time

        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));

        executorService.shutdown(); //shuts down executorService, otherwise the program would run forever
        System.out.println("Main method done");
    }
}

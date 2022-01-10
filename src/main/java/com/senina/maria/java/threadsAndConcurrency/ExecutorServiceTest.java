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
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new Task(1));
        //Two threads are now running at the same time
        executorService.execute(new Thread(new Task(2)));

        //Task 3: 301 to 399
        System.out.print("\n Task3 Kicked Off ");
        for(int i = 301; i <=399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n Task3 Done");

        executorService.shutdown(); //shuts down executorService, otherwise the program would run forever
        System.out.println("Main method done");
    }
}

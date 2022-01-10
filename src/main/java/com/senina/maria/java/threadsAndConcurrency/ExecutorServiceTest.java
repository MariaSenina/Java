package com.senina.maria.java.threadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(new Task1());
        //Task2 can only start when Task1 terminates
        executorService.execute(new Thread(new Task2()));

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

package com.senina.maria.java.threadsAndConcurrency;

class Task1 extends Thread {
    public void run() {    //exact signature
        System.out.print("\n Task1 Started ");

        for(int i = 101; i <=199; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n Task1 Done");
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {    //exact signature
        try {
            Thread.sleep(10000); //takes milliseconds
            System.out.println("Thread1 sleeping for 10 seconds");
        } catch (InterruptedException e) {
            System.out.println("exception caught");
        }

        System.out.print("\n Task2 Started ");

        for(int i = 201; i <=299; i++) {
            Thread.yield(); //request to give up CPU
            System.out.print(i + " ");
        }

        System.out.println("\n Task2 Done");
    }
}

public class ThreadBasicsTest {
    public static void main(String[] args) throws InterruptedException {

        //Task 1: 101 to 199
        System.out.print("\n Task1 Kicked Off ");
        Task1 task1 = new Task1();
        task1.setPriority(1);  //priorities range from 1 to 10 (5 is normal). NOTE: This is only a request
        task1.start();

        //Task 2: 201 to 299
        System.out.print("\n Task2 Kicked Off ");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();

        //Wait for task1 to complete before proceeding
        task1.join();
        task2Thread.join();

        //Task 3: 301 to 399
        System.out.print("\n Task3 Kicked Off ");
        for(int i = 301; i <=399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n Task3 Done");

        System.out.println("Main method done");
    }

    //Thread states:

    // -> NEW:
    //    -> Ready but not executed yet (before start() is called)
    // -> RUNNABLE:
    //    -> A thread is ready to run but another thread is being executed at that point
    // -> RUNNING:
    //    -> A thread is being executed
    // -> BLOCKED/WAITING:
    //    -> Waiting for an external service to be reached (i.e. return data from database)
    //    -> Waiting for another thread to provide information necessary for completion of this thread
    // -> TERMINATED/DEAD:
    //    -> Thread is done executing (execution complete)
}

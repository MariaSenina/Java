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

public class ThreadBasicsTest {
    public static void main(String[] args) {

        //Task 1: 101 to 199
        System.out.print("\n Task1 Kicked Off ");
        Task1 task1 = new Task1();
        task1.start();

        //Task 2: 201 to 299
        System.out.print("\n Task2 Kicked Off ");
        for(int i = 201; i <=299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n Task2 Done");

        //Task 3: 301 to 399
        System.out.print("\n Task3 Kicked Off ");
        for(int i = 301; i <=399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n Task3 Done");
    }
}

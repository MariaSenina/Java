package com.senina.maria.java.exceptions;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        try {
            someOtherMethod();
            System.out.println("Main");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void someOtherMethod() throws InterruptedException {
        System.out.println("someOtherMethod");
        Thread.sleep(2000);
    }

    //A checked exception MUST be either handled or thrown, otherwise the code will not compile.
    //Basically, Java checks if you have handled it.
}

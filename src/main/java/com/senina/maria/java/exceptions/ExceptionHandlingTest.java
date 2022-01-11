package com.senina.maria.java.exceptions;

public class ExceptionHandlingTest {
    public static void main(String[] args) {
        method1();
        System.out.println("Main ended");
    }

    private static void method1() {
        method2();
        System.out.println("Method1 ended");
    }

    private static void method2() {
        try {
            String str = null;
            str.length();
            System.out.println("Method2 ended");
        } catch(NullPointerException ex) { //the exception that is most specific to the case will be caught
            System.out.println("Matched NullPointerException");
            ex.printStackTrace();
        } catch(Exception ex) {
            System.out.println("Matched Exception");
            ex.printStackTrace();
        }
    }
}

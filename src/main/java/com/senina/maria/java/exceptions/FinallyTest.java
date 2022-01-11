package com.senina.maria.java.exceptions;

import java.util.Scanner;

public class FinallyTest {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            int[] numbers = {12, 3, 4, 5};
            int number = numbers[5];
        } catch(Exception e) {
            e.printStackTrace();
        } finally { //always executed
            System.out.println("Before scanner close");
            if(scanner != null) {
                scanner.close();
            }
        }

        System.out.println("Just before closing out main");
    }
}

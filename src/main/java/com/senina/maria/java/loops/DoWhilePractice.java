package com.senina.maria.java.loops;

import java.util.Scanner;

public class DoWhilePractice {

    //print cubes of a positive integer input by user
    public void cubesOfPositiveIntegers() {
        int input = 0;

        Scanner myNumber = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");

            input = myNumber.nextInt();

            if(input >= 0) {
                System.out.printf("The cube is %d", input * input * input).println();
            }
        } while (input >= 0);
        System.out.println("Thank you! Have fun!");
    }
}

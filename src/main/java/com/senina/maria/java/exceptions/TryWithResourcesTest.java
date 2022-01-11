package com.senina.maria.java.exceptions;

import java.util.Scanner;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        try (Scanner scanner =  new Scanner(System.in)) {
            int[] numbers = {12, 3, 4, 5};
            int number = numbers[5];
        }
        // ^ does not require a 'catch' or 'finally' (but you can have them if you want)
        // does NOT require scanner.close() because it closes automatically (implements AutoClosable)
    }
}

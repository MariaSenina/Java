package com.senina.maria.java.loops;

public class MyNumber {

    //variables
    private  int number;

    //constructor
    public MyNumber(int number) {
        this.number = number;
    }

    //prime number check method
    public boolean isPrime() {

        if (number < 2) {
            return false;
        }

        for(int i = 2; i <= number - 1; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //sum up to n (number)
    public int sumUpToN() {
        int sum = 0;

        for(int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    //sum of divisors
    public int sumOfDivisors() {
        int sum = 0;

        for(int i = 2; i < number; i ++) {
            if(number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //print a number triangle
    public void printANumberTriangle() {
        for(int n = 1; n <= number; n++) {
            for(int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

package com.senina.maria.java.loops;

public class MyNumberTest {

    public static void main(String[] args) {
        MyNumber number = new MyNumber(10);

        System.out.println(number.isPrime());

        System.out.println("Sum up to n = " + number.sumUpToN());

        System.out.println("Sum of divisors = " + number.sumOfDivisors());

        number.printANumberTriangle();
    }
}

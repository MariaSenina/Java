package com.senina.maria.java.loops;

public class WhilePractice {

    //variables
    private int limit;

    //constructor
    public WhilePractice(int limit) {
        this.limit = limit;
    }

    //print squares of numbers up to a given limit (i.e 1^2 = 1, 2^2 = 4, 3^2 = 9, etc.)
    public void printSquaresUpToLimit() {
        int i = 1;
        int power = 2;

        while(i * i < limit) {
            System.out.printf("%d ^%d = %d", i, power, (i * i)).println();
            i++;
        }
    }

    //print cubes of numbers up to a given limit (i.e. 1^3 = 1, 2^3 = 8, etc.)
    public void printCubesUpToLimit() {
        int i = 1;
        int power = 3;

        while(i * i * i < limit) {
            System.out.printf("%d ^%d = %d", i, power, (i * i * i)).println();
            i++;
        }
    }
}

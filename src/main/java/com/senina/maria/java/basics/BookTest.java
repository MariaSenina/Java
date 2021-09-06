/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senina.maria.java.basics;

/**
 *
 * @author macbookpro
 */
public class BookTest {

    public static void main(String args[]) {
        
        Book artOfComputerProgramming = new Book(1000);
        Book effectiveJava = new Book(1000);
        Book cleanCode = new Book();

        System.out.println(cleanCode.getNumberOfCopies());

        artOfComputerProgramming.setNumberOfCopies(100);
        System.out.println(artOfComputerProgramming.getNumberOfCopies());

        effectiveJava.setNumberOfCopies(50);
        System.out.println(effectiveJava.getNumberOfCopies());

        cleanCode.setNumberOfCopies(45);
        System.out.println(cleanCode.getNumberOfCopies());

        artOfComputerProgramming.increaseNoOfCopies(50);
        System.out.println(artOfComputerProgramming.getNumberOfCopies());

        effectiveJava.decreaseNoOfCopies(60);
        System.out.println(effectiveJava.getNumberOfCopies());

        System.out.println(cleanCode.getNumberOfCopies());
    }
}

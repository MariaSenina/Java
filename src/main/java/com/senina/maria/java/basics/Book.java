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
public class Book {
    
    int numberOfCopies;

    Book(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    Book() {
        this(1000);
    }
    
    void setNumberOfCopies(int numberOfCopies) {
        if(numberOfCopies >= 0) {
            this.numberOfCopies = numberOfCopies;
        } else {
            System.out.println("WARNING: The number of copies cannot be negative. Please check your input.");
        }
    }
    
    int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void increaseNoOfCopies(int howMuch) {
        setNumberOfCopies(this.numberOfCopies + howMuch);
    }

    public void decreaseNoOfCopies(int howMuch) {
        setNumberOfCopies(this.numberOfCopies - howMuch);
    }
}

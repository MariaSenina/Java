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
public class MotorBike {
    // state
    int speed;

    //constructor
    MotorBike(int speed) {
        this.speed = speed;
    }

    MotorBike() {
        this(5);
    }

    // setter
    void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative. Please check your input.");
        }
    }
    
    // getter
    int getSpeed() {
        return speed;
    }
    
    // behaviour
    void start (){
        System.out.println("Bike started");
    }

    public void increaseSpeed(int howMuch) {
        this.speed = this.speed + howMuch;
    }

    //validation
    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }
}

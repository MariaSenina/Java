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
public class MotorBikeTest {
    
    public static void main (String args []) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);
        
        //behaviour
        ducati.start();
        honda.start();
        
        //state
        ducati.setSpeed(100);
        honda.setSpeed(80);

        ducati.increaseSpeed(100);
        honda.increaseSpeed(100);

        ducati.decreaseSpeed(250);
        honda.decreaseSpeed(50);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}

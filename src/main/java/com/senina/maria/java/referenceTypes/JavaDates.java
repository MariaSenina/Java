package com.senina.maria.java.referenceTypes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaDates {

    public static void main(String[] args) {
        //LocalDate (holds a date)
        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date);

        // LocalTime (holds a time)
        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);

        // LocalDateTime (holds both date and time)
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date/Time: " + dateTime);
    }
}

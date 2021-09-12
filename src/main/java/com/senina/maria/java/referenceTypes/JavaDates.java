package com.senina.maria.java.referenceTypes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaDates {

    public static void main(String[] args) {
        //LocalDate (holds a date) * immutable
        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date);
        System.out.println("Year: " + date.getYear());
        System.out.println("Day of the week: " + date.getDayOfWeek());
        System.out.println("Day of the year: " + date.getDayOfYear());
        System.out.println("Leap year check: " + date. isLeapYear());
        System.out.println("Date in a 100 days from now: " + date.plusDays(100));
        System.out.println("Date 100 months ago: " + date.minusMonths(100));

        System.out.println();

        // LocalTime (holds a time) * immutable
        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);

        System.out.println();

        // LocalDateTime (holds both date and time) * immutable
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date/Time: " + dateTime);
    }
}

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

        System.out.println();

        //hard-code the date using .of(year, month, dayOfMonth)
        LocalDate yesterday = LocalDate.of(2021, 9, 11);
        System.out.println("Yesterday: " + yesterday);

        System.out.println();

        //modifying dates with specific attributes
        System.out.println("Today as a 100th day of the year: " + date.withDayOfYear(100));
        System.out.println("Today in year 2016: " + date.withYear(2016));
        System.out.println("Today as 20th day of the current month: " + date.withDayOfMonth(20));
        System.out.println("Today in the 3rd month of the year: " + date.withMonth(3));

        System.out.println();

        //compare dates
        System.out.println("\"date\" before \"yesterday\" check: " + date.isBefore(yesterday));
        System.out.println("\"date\" after \"yesterday\" check: " + date.isAfter(yesterday));
    }
}

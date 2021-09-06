package com.mycompany.java.Conditionals;

public class SwitchPracticeTest {

    public static void main(String[] args) {

        SwitchPractice dayOfTheWeek = new SwitchPractice();
        System.out.println("Weekday: " + dayOfTheWeek.isWeekday(7));

        System.out.println();

        SwitchPractice month = new SwitchPractice();
        System.out.println("Month: " + month.determineNameOfTheMonth(20));

        System.out.println();

        System.out.println("Day name: " + dayOfTheWeek.determineNameOfDay(10));
    }
}

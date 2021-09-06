package com.mycompany.java.Conditionals;

public class SwitchPractice {

    public static boolean isWeekday(int dayNumber) {
        boolean weekday = false; //has to be initialized because it is a local variable!!!
        
        switch (dayNumber) {
            case 1: //Monday
            case 2: //Tuesday
            case 3: //Wednesday
            case 4: //Thursday
            case 5: //Friday
                weekday = true;
                break;
            case 0: //Sunday
            case 6: //Saturday
                break;
            default:
                System.out.println("Invalid day number: " + dayNumber);
        }

        return weekday;
    }

    public static String determineNameOfTheMonth(int monthNumber) {
        String nameOfTheMonth = null;

        switch(monthNumber) {
            case 1:
                nameOfTheMonth = "January";
                break;
            case 2:
                nameOfTheMonth = "February";
                break;
            case 3:
                nameOfTheMonth = "March";
                break;
            case 4:
                nameOfTheMonth = "April";
                break;
            case 5:
                nameOfTheMonth = "May";
                break;
            case 6:
                nameOfTheMonth = "June";
                break;
            case 7:
                nameOfTheMonth = "July";
                break;
            case 8:
                nameOfTheMonth = "August";
                break;
            case 9:
                nameOfTheMonth = "September";
                break;
            case 10:
                nameOfTheMonth = "October";
                break;
            case 11:
                nameOfTheMonth = "November";
                break;
            case 12:
                nameOfTheMonth = "December";
                break;
            default:
                System.out.println("Invalid month number: " + monthNumber);
        }

        return nameOfTheMonth;
    }

    public static String determineNameOfDay(int dayNumber) {
        String nameOfDay = null;

        switch(dayNumber) {
            case 0:
                nameOfDay = "Sunday";
                break;
            case 1:
                nameOfDay = "Monday";
                break;
            case 2:
                nameOfDay = "Tuesday";
                break;
            case 3:
                nameOfDay = "Wednesday";
                break;
            case 4:
                nameOfDay = "Thursday";
                break;
            case 5:
                nameOfDay = "Friday";
                break;
            case 6:
                nameOfDay = "Saturday";
                break;
            default:
                System.out.println("Invalid day number: " + dayNumber);
        }

        return nameOfDay;
    }
}

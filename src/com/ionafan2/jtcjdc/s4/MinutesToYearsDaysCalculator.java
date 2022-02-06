package com.ionafan2.jtcjdc.s4;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long minutesInAYear = 60 * 24 * 365;
            System.out.printf(
                    "%s min = %s y and %s d%n",
                    minutes,
                    minutes / minutesInAYear,
                    (minutes % minutesInAYear) / (60 * 24)
            );
        }
    }
}

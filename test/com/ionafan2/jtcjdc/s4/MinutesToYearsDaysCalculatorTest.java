package com.ionafan2.jtcjdc.s4;

import org.junit.jupiter.api.Test;

class MinutesToYearsDaysCalculatorTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
     * <li>printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
     * <li>printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
     */
    @Test
    void printYearsAndDays() {
        System.out.println("\nMinutesToYearsDaysCalculator.printYearsAndDays - test results:");
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }
}
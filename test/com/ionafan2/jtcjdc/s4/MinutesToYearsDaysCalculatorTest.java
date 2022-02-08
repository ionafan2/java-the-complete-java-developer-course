package com.ionafan2.jtcjdc.s4;

import com.ionafan2.jtcjdc.TestSysOutput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinutesToYearsDaysCalculatorTest extends TestSysOutput {

    /**
     * Examples of input/output:
     * <br>
     * <li>printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
     * <li>printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
     * <li>printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
     */
    @Test
    void printYearsAndDays() {
        setUpStreams();

        long minutes = 525600;
        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);
        String expected1 = minutes + " min = 1 y and 0 d\n";

        minutes = 1051200;
        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);
        String expected2 = minutes + " min = 2 y and 0 d\n";

        minutes = 561600;
        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);
        String expected3 = minutes + " min = 1 y and 25 d\n";

        assertEquals(expected1 + expected2 + expected3, outContent.toString());

        restoreStreams();
    }
}
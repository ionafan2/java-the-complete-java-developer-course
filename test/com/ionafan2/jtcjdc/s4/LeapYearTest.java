package com.ionafan2.jtcjdc.s4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)
     * <li>isLeapYear(1600); → should return true since 1600 is a leap year
     * <li>isLeapYear(2017); → should return false since 2017 is not a leap year
     * <li>isLeapYear(2000);  → should return true because 2000 is a leap year
     */
    @Test
    void isLeapYear() {
        assertFalse(LeapYear.isLeapYear(-1600));
        assertTrue(LeapYear.isLeapYear(1600));
        assertFalse(LeapYear.isLeapYear(2017));
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2400));

        assertFalse(LeapYear.isLeapYear(1700));
        assertFalse(LeapYear.isLeapYear(1800));
        assertFalse(LeapYear.isLeapYear(1900));
        assertFalse(LeapYear.isLeapYear(2100));
        assertFalse(LeapYear.isLeapYear(2200));
        assertFalse(LeapYear.isLeapYear(2300));
        assertFalse(LeapYear.isLeapYear(2500));
        assertFalse(LeapYear.isLeapYear(2600));
    }
}
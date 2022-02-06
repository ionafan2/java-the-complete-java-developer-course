package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDaysInMonthTest {

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
        assertFalse(NumberOfDaysInMonth.isLeapYear(-1600));
        assertTrue(NumberOfDaysInMonth.isLeapYear(1600));
        assertFalse(NumberOfDaysInMonth.isLeapYear(2017));
        assertTrue(NumberOfDaysInMonth.isLeapYear(2000));
        assertTrue(NumberOfDaysInMonth.isLeapYear(2400));

        assertFalse(NumberOfDaysInMonth.isLeapYear(1700));
        assertFalse(NumberOfDaysInMonth.isLeapYear(1800));
        assertFalse(NumberOfDaysInMonth.isLeapYear(1900));
        assertFalse(NumberOfDaysInMonth.isLeapYear(2100));
        assertFalse(NumberOfDaysInMonth.isLeapYear(2200));
        assertFalse(NumberOfDaysInMonth.isLeapYear(2300));
        assertFalse(NumberOfDaysInMonth.isLeapYear(2500));
        assertFalse(NumberOfDaysInMonth.isLeapYear(2600));
    }


    /**
     * Examples of input/output:
     * <br>
     * <li>getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
     * <li>getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
     * <li>getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
     * <li>getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
     * <li>getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.
     */
    @Test
    void getDaysInMonth() {
        assertEquals(31, NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        assertEquals(29, NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        assertEquals(28, NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(1, -2020));
    }
}
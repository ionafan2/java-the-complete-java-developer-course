package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitCheckerTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
     * <li>hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
     * <li>hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000
     */
    @Test
    void hasSameLastDigit() {
        assertTrue(LastDigitChecker.hasSameLastDigit(41, 22, 71));
        assertTrue(LastDigitChecker.hasSameLastDigit(23, 32, 42));
        assertFalse(LastDigitChecker.hasSameLastDigit(9, 99, 999));
    }

    /**
     * Examples of input/output:
     * <br>
     * <li>isValid(10); → should return true since 10 is within the range of 10-1000
     * <li>isValid(468); → should return true since 468 is within the range of 10-1000
     * <li>isValid(1051); → should return false since 1051 is not within the range of 10-1000
     */
    @Test
    void isValid() {
        assertTrue(LastDigitChecker.isValid(10));
        assertTrue(LastDigitChecker.isValid(468));
        assertFalse(LastDigitChecker.isValid(1051));

        assertTrue(LastDigitChecker.isValid(1000));
        assertFalse(LastDigitChecker.isValid(9));
    }
}
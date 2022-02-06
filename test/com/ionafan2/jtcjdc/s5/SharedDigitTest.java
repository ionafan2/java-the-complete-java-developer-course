package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharedDigitTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
     * <li>hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
     * <li>hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
     * <li>hasSharedDigit(22, 33); → should return false
     */
    @Test
    void hasSharedDigit() {
        assertTrue(SharedDigit.hasSharedDigit(12, 23));
        assertFalse(SharedDigit.hasSharedDigit(99, 9));
        assertTrue(SharedDigit.hasSharedDigit(15, 55));
        assertFalse(SharedDigit.hasSharedDigit(22, 33));
    }
}
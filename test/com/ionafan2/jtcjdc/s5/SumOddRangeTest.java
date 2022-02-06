package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOddRangeTest {

    /**
     * Example input/output:
     * <br>
     * <li>isOdd(1); → should return true
     * <li>isOdd(3); → should return true
     * <li>isOdd(2); → should return false
     * <li>isOdd(4); → should return false
     * <li>isOdd(-1); → should return false
     */
    @Test
    void isOdd() {
        assertTrue(SumOddRange.isOdd(1));
        assertTrue(SumOddRange.isOdd(3));
        assertFalse(SumOddRange.isOdd(2));
        assertFalse(SumOddRange.isOdd(4));
        assertFalse(SumOddRange.isOdd(-1));
    }

    /**
     * Example input/output:
     * <br>
     * <li>sumOdd(1, 100); → should return 2500
     * <li>sumOdd(-1, 100); →  should return -1
     * <li>sumOdd(100, 100); → should return 0
     * <li>sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
     * <li>sumOdd(100, -100); → should return -1
     * <li>sumOdd(100, 1000); → should return 247500
     */
    @Test
    void sumOdd() {
        assertEquals(2500, SumOddRange.sumOdd(1, 100));
        assertEquals(-1, SumOddRange.sumOdd(-1, 100));
        assertEquals(0, SumOddRange.sumOdd(100, 100));
        assertEquals(13, SumOddRange.sumOdd(13, 13));
        assertEquals(-1, SumOddRange.sumOdd(100, -100));
        assertEquals(247500, SumOddRange.sumOdd(100, 1000));
    }
}
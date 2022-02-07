package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
     * <li>getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
     * <li>getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
     * <li>getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder
     */
    @Test
    void getGreatestCommonDivisor() {
        assertEquals(5, GreatestCommonDivisor.getGreatestCommonDivisor(25,15));
        assertEquals(6, GreatestCommonDivisor.getGreatestCommonDivisor(12,30));
        assertEquals(-1, GreatestCommonDivisor.getGreatestCommonDivisor(9,18));
        assertEquals(9, GreatestCommonDivisor.getGreatestCommonDivisor(81,153));
    }
}
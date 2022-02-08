package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
     * <li>isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
     * <li>isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5
     * <li>isPerfectNumber(-1); should return false since the number is < 1
     */
    @Test
    void isPerfectNumber() {
        assertTrue(PerfectNumber.isPerfectNumber(6));
        assertTrue(PerfectNumber.isPerfectNumber(28));
        assertFalse(PerfectNumber.isPerfectNumber(5));
        assertFalse(PerfectNumber.isPerfectNumber(-1));
    }
}
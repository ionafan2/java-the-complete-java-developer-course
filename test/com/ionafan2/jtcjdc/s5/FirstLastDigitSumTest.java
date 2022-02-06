package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLastDigitSumTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
     * <li>sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
     * <li>sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
     * <li>sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
     * <li>sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
     */
    @Test
    void sumFirstAndLastDigit() {

        assertEquals(4, FirstLastDigitSum.sumFirstAndLastDigit(252));
        assertEquals(9, FirstLastDigitSum.sumFirstAndLastDigit(257));
        assertEquals(0, FirstLastDigitSum.sumFirstAndLastDigit(0));
        assertEquals(10, FirstLastDigitSum.sumFirstAndLastDigit(5));
        assertEquals(-1, FirstLastDigitSum.sumFirstAndLastDigit(-10));
    }
}
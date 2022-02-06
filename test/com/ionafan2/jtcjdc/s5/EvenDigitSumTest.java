package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitSumTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
     * <li>getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
     * <li>getEvenDigitSum(-22); → should return -1 since the number is negative
     */
    @Test
    void getEvenDigitSum() {
        assertEquals(20, EvenDigitSum.getEvenDigitSum(123456789));
        assertEquals(4, EvenDigitSum.getEvenDigitSum(252));
        assertEquals(-1, EvenDigitSum.getEvenDigitSum(-22));
    }
}
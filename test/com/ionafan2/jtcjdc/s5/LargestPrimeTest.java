package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
     * <li>getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
     * <li>getLargestPrime (0); should return -1 since 0 does not have any prime numbers
     * <li>getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
     * <li>getLargestPrime (-1); should return -1 since the parameter is negative
     */
    @Test
    void getLargestPrime() {
        assertEquals(7, LargestPrime.getLargestPrime(21));
        assertEquals(31, LargestPrime.getLargestPrime(217));
        assertEquals(-1, LargestPrime.getLargestPrime(0));
        assertEquals(5, LargestPrime.getLargestPrime(45));
        assertEquals(-1, LargestPrime.getLargestPrime(-1));
    }
}
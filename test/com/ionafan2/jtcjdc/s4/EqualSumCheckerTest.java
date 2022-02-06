package com.ionafan2.jtcjdc.s4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumCheckerTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
     * <li>hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
     * <li>hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0
     */
    @Test
    void hasEqualSum() {
        assertFalse(EqualSumChecker.hasEqualSum(1, 1, 1));
        assertTrue(EqualSumChecker.hasEqualSum(1, 1, 2));
        assertTrue(EqualSumChecker.hasEqualSum(1, -1, 0));
    }
}
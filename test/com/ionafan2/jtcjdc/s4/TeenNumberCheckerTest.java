package com.ionafan2.jtcjdc.s4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
     * <li>hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
     * <li>hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
     */
    @Test
    void hasTeen() {
        assertTrue(TeenNumberChecker.hasTeen(9, 99, 19));
        assertTrue(TeenNumberChecker.hasTeen(23, 15, 42));
        assertFalse(TeenNumberChecker.hasTeen(22, 23, 34));
    }

    /**
     * Examples of input/output:
     * <br>
     * <li>isTeen(9);  should return false since 9 is in not range 13 - 19
     * <li>isTeen(13);  should return true since 13 is in range 13 - 19
     */
    @Test
    void isTeen() {
        assertFalse(TeenNumberChecker.isTeen(9));
        assertTrue(TeenNumberChecker.isTeen(13));
        assertFalse(TeenNumberChecker.isTeen(21));
    }
}
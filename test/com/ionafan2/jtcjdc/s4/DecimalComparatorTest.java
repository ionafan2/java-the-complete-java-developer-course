package com.ionafan2.jtcjdc.s4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DecimalComparatorTest {

    /**
     * Examples of input/output:
     * <p>
     * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
     * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
     * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
     * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
     */
    @Test
    void areEqualByThreeDecimalPlaces() {
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
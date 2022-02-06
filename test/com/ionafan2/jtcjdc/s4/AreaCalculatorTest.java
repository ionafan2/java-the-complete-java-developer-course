package com.ionafan2.jtcjdc.s4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>area(5.0); should return 78.53981633974483
     * <li>area(-1);  should return -1 since the parameter is negative
     * <li>area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
     * <li>area(-1.0, 4.0);  should return -1 since first the parameter is negative
     */
    @Test
    void area() {
        assertEquals(78.53981633974483, AreaCalculator.area(5.0));
        assertEquals(-1, AreaCalculator.area(-1.0));
        assertEquals(20.0, AreaCalculator.area(5.0, 4.0));
        assertEquals(-1, AreaCalculator.area(-1.0, 4.0));
    }
}
package com.ionafan2.jtcjdc.s4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedConverterTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>toMilesPerHour(1.5); → should return value 1
     * <li>toMilesPerHour(10.25); → should return value 6
     * <li>toMilesPerHour(-5.6); → should return value -1
     * <li>toMilesPerHour(25.42); → should return value 16
     * <li>toMilesPerHour(75.114); → should return value 47
     */
    @Test
    void toMilesPerHour() {
        assertEquals(1, SpeedConverter.toMilesPerHour(1.5));
        assertEquals(6, SpeedConverter.toMilesPerHour(10.25));
        assertEquals(-1, SpeedConverter.toMilesPerHour(-5.62));
        assertEquals(16, SpeedConverter.toMilesPerHour(25.42));
        assertEquals(47, SpeedConverter.toMilesPerHour(75.114));
    }
}
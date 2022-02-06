package com.ionafan2.jtcjdc.s4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SpeedConverterTest {

    /**
     * Examples of input/output:
     * toMilesPerHour(1.5); → should return value 1
     * toMilesPerHour(10.25); → should return value 6
     * toMilesPerHour(-5.6); → should return value -1
     * toMilesPerHour(25.42); → should return value 16
     * toMilesPerHour(75.114); → should return value 47
     */
    @Test
    void toMilesPerHour() {
        assertEquals(SpeedConverter.toMilesPerHour(1.5), 1);
        assertEquals(SpeedConverter.toMilesPerHour(10.25), 6);
        assertEquals(SpeedConverter.toMilesPerHour(-5.62), -1);
        assertEquals(SpeedConverter.toMilesPerHour(25.42), 16);
        assertEquals(SpeedConverter.toMilesPerHour(75.114), 47);
    }
}
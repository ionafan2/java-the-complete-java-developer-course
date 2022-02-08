package com.ionafan2.jtcjdc.s4;

import com.ionafan2.jtcjdc.TestSysOutput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedConverterTest  extends TestSysOutput {

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

    @Test
    void printConversion() {

        setUpStreams();

        double kmPerHour = 1.5;
        SpeedConverter.printConversion(kmPerHour);
        String expected1 = kmPerHour + " km/h = " + SpeedConverter.toMilesPerHour(kmPerHour) + " mi/h\n";

        kmPerHour = 10.25;
        SpeedConverter.printConversion(kmPerHour);
        String expected2 = kmPerHour + " km/h = " + SpeedConverter.toMilesPerHour(kmPerHour) + " mi/h\n";

        kmPerHour = -1;
        SpeedConverter.printConversion(kmPerHour);
        String expected3 = "Invalid Value\n";

        assertEquals( expected1 + expected2 + expected3, outContent.toString());

        restoreStreams();
    }
}
package com.ionafan2.jtcjdc.s4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondsAndMinutesTest {

    @Test
    void getDurationString() {
        assertEquals(SecondsAndMinutes.INVALID, SecondsAndMinutes.getDurationString(-1));
        assertEquals(SecondsAndMinutes.INVALID, SecondsAndMinutes.getDurationString(5, 61));

        assertEquals(
                String.format(SecondsAndMinutes.OUTPUT_FORMAT, 0, 1, 59),
                SecondsAndMinutes.getDurationString(1, 59)
        );

        assertEquals(
                String.format(SecondsAndMinutes.OUTPUT_FORMAT, 2, 0, 30),
                SecondsAndMinutes.getDurationString(120, 30)
        );

        assertEquals(
                String.format(SecondsAndMinutes.OUTPUT_FORMAT, 727, 0, 13),
                SecondsAndMinutes.getDurationString(2617213)
        );
    }
}
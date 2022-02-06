package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchToCmConvertedTest {

    @Test
    void calcFeetAndInchesToCentimeters() {
        assertEquals(203.2, InchToCmConverted.calcFeetAndInchesToCentimeters(6, 8));
        assertEquals(60.96, InchToCmConverted.calcFeetAndInchesToCentimeters(24));
        assertEquals(-1, InchToCmConverted.calcFeetAndInchesToCentimeters(5, 24));
        assertEquals(-1, InchToCmConverted.calcFeetAndInchesToCentimeters(-1));
        assertEquals(-1, InchToCmConverted.calcFeetAndInchesToCentimeters(-1, 8));
    }
}
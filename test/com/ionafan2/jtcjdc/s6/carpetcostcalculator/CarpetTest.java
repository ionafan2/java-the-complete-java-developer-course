package com.ionafan2.jtcjdc.s6.carpetcostcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarpetTest {

    @Test
    void getCost() {
        Carpet carpet = new Carpet(24.0);
        assertEquals(24.0, carpet.getCost());
    }
}
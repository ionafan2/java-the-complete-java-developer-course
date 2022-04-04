package com.ionafan2.jtcjdc.s6.carpetcostcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FloorTest {

    @Test
    void getArea() {

        Floor floor = new Floor(5, 5);
        assertEquals(25.0, floor.getArea());
    }
}
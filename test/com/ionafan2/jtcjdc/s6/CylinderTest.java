package com.ionafan2.jtcjdc.s6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getVolume() {
        Cylinder test = new Cylinder(5.55, 7.25);
        assertEquals(701.574580913447, test.getVolume());

        Cylinder test2 = new Cylinder(3, -4);
        assertEquals(0, test2.getVolume());
        assertEquals(28.274333882308138, test2.getArea());
        assertEquals(3, test2.getRadius());
    }
}
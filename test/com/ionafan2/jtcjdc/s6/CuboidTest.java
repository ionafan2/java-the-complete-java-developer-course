package com.ionafan2.jtcjdc.s6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    @Test
    void getVolume() {

        Cuboid test = new Cuboid(5, 10, 5);
        assertEquals(250, test.getVolume());

        Cuboid test2 = new Cuboid(5, 10, -1);
        assertEquals(0, test2.getVolume());
        assertEquals(0, test2.getHeight());
        assertEquals(5, test2.getWidth());
        assertEquals(10, test2.getLength());
    }
}
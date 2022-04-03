package com.ionafan2.jtcjdc.s6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {

    @Test
    void getArea() {

        Wall wall = new Wall(-1, 5);

        assertEquals(0, wall.getArea());

        wall.setHeight(8);
        wall.setWidth(2);

        assertEquals(16, wall.getArea());

        wall.setWidth(-1);

        assertEquals(0, wall.getWidth());
        assertEquals(0, wall.getArea());

        wall.setHeight(-1);
        wall.setWidth(4);

        assertEquals(0, wall.getHeight());
        assertEquals(0, wall.getArea());
    }
}
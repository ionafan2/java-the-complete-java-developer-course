package com.ionafan2.jtcjdc.s6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void distance() {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        assertEquals(7.810249675906654, first.distance());
        assertEquals(5.0, first.distance(second));
        assertEquals(5.0, first.distance(2,2));

        Point point = new Point();

        assertEquals(0, point.distance());

    }
}
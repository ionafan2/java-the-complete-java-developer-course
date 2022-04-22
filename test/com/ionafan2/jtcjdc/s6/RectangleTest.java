package com.ionafan2.jtcjdc.s6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {

        Rectangle test = new Rectangle(5,10);
        assertEquals(50, test.getArea());

        Rectangle test2 = new Rectangle(-1,10);
        assertEquals(0, test2.getArea());
        assertEquals(0, test2.getWidth());
        assertEquals(10, test2.getLength());
    }
}
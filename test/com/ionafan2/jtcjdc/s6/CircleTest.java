package com.ionafan2.jtcjdc.s6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {

        Circle test1 = new Circle(3.75);
        assertEquals(44.178646691106465, test1.getArea());

        Circle test2 = new Circle(5.55);
        assertEquals(96.76890771219959, test2.getArea());

        Circle test3 = new Circle(-3);
        assertEquals(0, test3.getRadius());
    }
}
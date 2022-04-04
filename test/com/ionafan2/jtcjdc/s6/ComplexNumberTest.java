package com.ionafan2.jtcjdc.s6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {


    @Test
    void addAndSubtract() {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1,1);

        assertEquals(2, one.getReal());
        assertEquals(2, one.getImaginary());

        one.subtract(number);

        assertEquals(-0.5, one.getReal());
        assertEquals(3.5, one.getImaginary());

        number.subtract(one);

        assertEquals(3.0, number.getReal());
        assertEquals(-5.0, number.getImaginary());
    }
}
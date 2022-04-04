package com.ionafan2.jtcjdc.s6.carpetcostcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void getTotalCost() {

        Calculator calculator = new Calculator(
                new Floor(5, 5),
                new Carpet(10)
        );

        assertEquals(250.0, calculator.getTotalCost());
    }
}
package com.ionafan2.jtcjdc.s6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void calcOperationTest() {

        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        assertEquals(9.0, calculator.getAdditionResult());
        assertEquals(1.0, calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        assertEquals(0.0, calculator.getMultiplicationResult());
        assertEquals(0.0, calculator.getDivisionResult());
    }

}
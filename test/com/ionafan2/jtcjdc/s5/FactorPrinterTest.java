package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

class FactorPrinterTest {

    @Test
    void printFactors() {
        System.out.println("\nFactorPrinterTest.printFactors - test results:");
        FactorPrinter.printFactors(-1);
        FactorPrinter.printFactors(6);
        FactorPrinter.printFactors(3);
    }
}
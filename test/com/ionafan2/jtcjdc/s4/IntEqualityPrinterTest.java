package com.ionafan2.jtcjdc.s4;

import org.junit.jupiter.api.Test;

class IntEqualityPrinterTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>printEqual(1, 1, 1); should print text All numbers are equal
     * <li>printEqual(1, 1, 2); should print text Neither all are equal or different
     * <li>printEqual(-1, -1, -1); should print text Invalid Value
     * <li>printEqual(1, 2, 3); should print text All numbers are different
     */
    @Test
    void printEqual() {
        System.out.println("\nIntEqualityPrinter.printEqual - test results:");
        IntEqualityPrinter.printEqual(1, 1, 1);
        IntEqualityPrinter.printEqual(1, 1, 2);
        IntEqualityPrinter.printEqual(-1, -1, -1);
        IntEqualityPrinter.printEqual(1, 2, 3);
    }
}
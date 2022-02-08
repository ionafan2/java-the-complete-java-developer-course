package com.ionafan2.jtcjdc.s4;

import com.ionafan2.jtcjdc.TestSysOutput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntEqualityPrinterTest extends TestSysOutput {

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
        setUpStreams();

        IntEqualityPrinter.printEqual(1, 1, 1);
        String expected1 = "All numbers are equal\n";

        IntEqualityPrinter.printEqual(1, 1, 2);
        String expected2 = "Neither all are equal or different\n";

        IntEqualityPrinter.printEqual(-1, -1, -1);
        String expected3 = "Invalid Value\n";

        IntEqualityPrinter.printEqual(1, 2, 3);
        String expected4 = "All numbers are different\n";

        assertEquals( expected1 + expected2 + expected3 + expected4, outContent.toString());

        restoreStreams();
    }
}
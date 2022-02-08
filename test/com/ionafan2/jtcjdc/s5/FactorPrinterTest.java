package com.ionafan2.jtcjdc.s5;

import com.ionafan2.jtcjdc.TestSysOutput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorPrinterTest extends TestSysOutput {

    /**
     * Examples of input/output:
     * <br>
     * <li>printFactors(6); → should print 1 2 3 6
     * <li>printFactors(32); → should print 1 2 4 8 16 32
     * <li>printFactors(10); → should print 1 2 5 10
     * <li>printFactors(-1); → should print "Invalid Value" since number is < 1
     */
    @Test
    void printFactors() {
        setUpStreams();

        FactorPrinter.printFactors(-1);
        String expected1 ="Invalid Value\n";

        FactorPrinter.printFactors(6);
        String expected2 ="1\n2\n3\n6\n";

        FactorPrinter.printFactors(3);
        String expected3 ="1\n3\n";

        assertEquals( expected1 + expected2 + expected3, outContent.toString());

        restoreStreams();
    }
}
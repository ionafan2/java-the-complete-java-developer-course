package com.ionafan2.jtcjdc.s5;

import com.ionafan2.jtcjdc.TestSysOutput;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputCalculatorTest extends TestSysOutput  {

    /**
     * Examples of input/output:
     * <br>
     * <li>1 2 3 4 5 a → should print SUM = 15 AVG = 3
     * <li>hello → SUM = 0 AVG = 0
     * <li>-1 5 7 b  → should print SUM = 11 AVG = 4
     */
    @Test
    void inputThenPrintSumAndAverage() {
        setUpStreams();

        String data = "hello";
        String expected1 = "SUM = 0 AVG = 0\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));
        InputCalculator.inputThenPrintSumAndAverage(System.in);

        String data2 = "1" +
                "\n2" +
                "\n3" +
                "\n4" +
                "\n5" +
                "\na"
                ;

        String expected2 = "SUM = 15 AVG = 3\n";

        System.setIn(new ByteArrayInputStream(data2.getBytes()));
        InputCalculator.inputThenPrintSumAndAverage(System.in);

        String data3 = "-1" +
                "\n5" +
                "\n7" +
                "\nb"
                ;

        String expected3 = "SUM = 11 AVG = 4\n";

        System.setIn(new ByteArrayInputStream(data3.getBytes()));
        InputCalculator.inputThenPrintSumAndAverage(System.in);

        assertEquals(expected1 + expected2 + expected3, outContent.toString());

        restoreStreams();
    }
}
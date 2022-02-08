package com.ionafan2.jtcjdc.s5;

import com.ionafan2.jtcjdc.TestSysOutput;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberToWordsTest extends TestSysOutput {

    /**
     * Examples of input/output:
     * <br>
     * <li>numberToWords(123); should return "One Two Three".
     * <li>numberToWords(1010); should return "One Zero One Zero".
     * <li>numberToWords(1000); should return "One Zero Zero Zero".
     * <li>numberToWords(-12); should return "Invalid Value" since the parameter is negative.
     */
    @Test
    void numberToWords() {
        setUpStreams();

        NumberToWords.numberToWords(0);
        String expected0 = "Zero\n";

        NumberToWords.numberToWords(123);
        String expected1 = "One\nTwo\nThree\n";

        NumberToWords.numberToWords(1010);
        String expected2 = "One\nZero\nOne\nZero\n";

        NumberToWords.numberToWords(1000);
        String expected3 = "One\nZero\nZero\nZero\n";

        NumberToWords.numberToWords(-1);
        String expected4 = "Invalid Value\n";

        assertEquals(expected0 + expected1 + expected2 + expected3 + expected4, outContent.toString());

        restoreStreams();
    }

    /**
     * Examples of input/output:
     * <br>
     * <li>reverse(-121); should  return -121
     * <li>reverse(1212); should return  2121
     * <li>reverse(1234); should return 4321
     * <li>reverse(100); should return 1
     */
    @Test
    void reverse() {
        assertEquals(-121, NumberToWords.reverse(-121));
        assertEquals(1212, NumberToWords.reverse(2121));
        assertEquals(1234, NumberToWords.reverse(4321));
        assertEquals(1, NumberToWords.reverse(100));

        assertEquals(101, NumberToWords.reverse(1010));
    }

    /**
     * Examples of input/output:
     * <br>
     * <li>getDigitCount(0); should return 1 since there is only 1 digit
     * <li>getDigitCount(123); should return 3
     * <li>getDigitCount(-12); should return -1 since the parameter is negative
     * <li>getDigitCount(5200); should return 4 since there are 4 digits in the number
     */
    @Test
    void getDigitCount() {
        assertEquals(1, NumberToWords.getDigitCount(0));
        assertEquals(3, NumberToWords.getDigitCount(123));
        assertEquals(-1, NumberToWords.getDigitCount(-12));
        assertEquals(4, NumberToWords.getDigitCount(5200));
        assertEquals(4, NumberToWords.getDigitCount(1010));
    }

}
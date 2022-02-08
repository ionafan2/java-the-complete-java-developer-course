package com.ionafan2.jtcjdc.s5;

import com.ionafan2.jtcjdc.TestSysOutput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberInWordTest extends TestSysOutput {

    @Test
    void printNumberInWord() {
        setUpStreams();

        NumberInWord.printNumberInWord(0);
        String expected1 ="ZERO\n";

        NumberInWord.printNumberInWord(1);
        String expected2 ="ONE\n";

        NumberInWord.printNumberInWord(9);
        String expected3 ="NINE\n";

        assertEquals( expected1 + expected2 + expected3, outContent.toString());

        restoreStreams();
    }
}
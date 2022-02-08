package com.ionafan2.jtcjdc.s4;

import com.ionafan2.jtcjdc.TestSysOutput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MegaBytesConverterTest extends TestSysOutput {

    /**
     * printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"
     * printMegaBytesAndKiloBytes(-1024); → should print the following text: "Invalid Value" because parameter is less than 0.
     * printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"
     */
    @Test
    void printMegaBytesAndKiloBytes() {
        setUpStreams();

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        String expected1 = "2500 KB = 2 MB and 452 KB\n";

        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        String expected2 = "Invalid Value\n";

        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        String expected3 = "5000 KB = 4 MB and 904 KB\n";

        assertEquals( expected1 + expected2 + expected3, outContent.toString());

        restoreStreams();
    }
}
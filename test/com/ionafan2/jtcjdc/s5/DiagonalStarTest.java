package com.ionafan2.jtcjdc.s5;

import com.ionafan2.jtcjdc.TestSysOutput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiagonalStarTest extends TestSysOutput {

    /**
     * Examples of input/output:
     * <br>
     * 0 is a space<br>
     * <li>printSquareStar(5); should print the following:<br>
     * ***** 5 stars<br>
     * **0** 2 stars space 2 star<br>
     * *0*0* 1 star space 1 star space 1 star<br>
     * **0** 2 stars space 2 star<br>
     * ***** 5 stars <br>
     * <li>printSquareStar(8); should print the following:<br>
     * ********<br>
     * **0000**<br>
     * *0*00*0*<br>
     * *00**00*<br>
     * *00**00*<br>
     * *0*00*0*<br>
     * **0000**<br>
     * ********<br>
     */
    @Test
    void printSquareStar() {
        setUpStreams();

        DiagonalStar.printSquareStar(4);
        String expected1 = "Invalid Value\n";

        DiagonalStar.printSquareStar(5);
        String expected2 =
                        "*****\n" +
                        "** **\n" +
                        "* * *\n" +
                        "** **\n" +
                        "*****\n";

        DiagonalStar.printSquareStar(8);
        String expected3 =
                        "********\n" +
                        "**    **\n" +
                        "* *  * *\n" +
                        "*  **  *\n" +
                        "*  **  *\n" +
                        "* *  * *\n" +
                        "**    **\n" +
                        "********\n";

        assertEquals(expected1 + expected2 + expected3, outContent.toString());

        restoreStreams();
    }
}
package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FlourPackerTest {

    /**
     * Examples of input/output:
     * <br>
     * canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
     * canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
     * canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
     * canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
     * canPack (-3, 2, 12); should return false since bigCount is negative.
     */
    @Test
    void canPack() {
        assertFalse(FlourPacker.canPack(1, 0, 4));
        assertTrue(FlourPacker.canPack(1, 0, 5));
        assertTrue(FlourPacker.canPack(0, 5, 4));
        assertTrue(FlourPacker.canPack(2, 2, 11));
        assertFalse(FlourPacker.canPack(-3, 2, 12));

        assertFalse(FlourPacker.canPack(0, 4, 5));
        assertFalse(FlourPacker.canPack(1, 0, 6));
        assertFalse(FlourPacker.canPack(2, 2, 4));
        assertFalse(FlourPacker.canPack(2, 2, 13));
    }
}
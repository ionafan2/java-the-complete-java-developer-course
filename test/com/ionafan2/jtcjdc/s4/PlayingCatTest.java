package com.ionafan2.jtcjdc.s4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCatTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45
     * <li>isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
     * <li>isCatPlaying(false, 35); should return true since temperature is in range 25 - 35
     */
    @Test
    void isCatPlaying() {
        assertFalse(PlayingCat.isCatPlaying(true, 10));
        assertFalse(PlayingCat.isCatPlaying(false, 36));
        assertTrue(PlayingCat.isCatPlaying(false, 35));
    }
}
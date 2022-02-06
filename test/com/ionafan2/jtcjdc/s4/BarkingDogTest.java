package com.ionafan2.jtcjdc.s4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarkingDogTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>shouldWakeUp (true, 1); → should return true
     * <li>shouldWakeUp (false, 2); → should return false since the dog is not barking.
     * <li>shouldWakeUp (true, 8); → should return false, since it's not before 8.
     * <li>shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.
     */
    @Test
    void shouldWakeUp() {
        assertTrue(BarkingDog.shouldWakeUp(true, 1));
        assertFalse(BarkingDog.shouldWakeUp(false, 2));
        assertFalse(BarkingDog.shouldWakeUp(true, 8));
        assertFalse(BarkingDog.shouldWakeUp(true, -1));
    }
}
package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

class NumberInWordTest {

    @Test
    void printNumberInWord() {
        System.out.println("\nNumberInWordTest.printNumberInWord - test results:");
        NumberInWord.printNumberInWord(0);
        NumberInWord.printNumberInWord(1);
        NumberInWord.printNumberInWord(9);
    }
}
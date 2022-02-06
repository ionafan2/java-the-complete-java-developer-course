package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeTest {

    /**
     * Example Input/Output
     * <br>
     * <li>isPalindrome(-1221); → should return true
     * <li>isPalindrome(707); → should return true
     * <li>isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
     */
    @Test
    void isPalindrome() {
        assertTrue(NumberPalindrome.isPalindrome(-1221));
        assertTrue(NumberPalindrome.isPalindrome(707));
        assertFalse(NumberPalindrome.isPalindrome(11212));
    }
}
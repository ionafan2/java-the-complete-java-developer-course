package com.ionafan2.jtcjdc.s5;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        if (number < 10) {
            return true;
        }
        int origNumber = number;
        int reverseNumber = 0;

        while (number > 0) {
            reverseNumber *= 10;
            reverseNumber += (number % 10);
            number /= 10;
        }

        return origNumber == reverseNumber;
    }

}

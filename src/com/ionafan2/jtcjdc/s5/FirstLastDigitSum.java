package com.ionafan2.jtcjdc.s5;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        if (number < 10) {
            return number * 2;
        }

        int lastDigit = number % 10;

        int firstDigit = 0;

        while (number > 9) {
            number /= 10;
            firstDigit = number % 10;
        }

        return firstDigit + lastDigit;
    }
}

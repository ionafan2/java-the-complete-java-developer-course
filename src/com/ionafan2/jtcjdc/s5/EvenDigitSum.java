package com.ionafan2.jtcjdc.s5;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int summary = 0;

        while (number > 0) {

            if (number % 2 == 0) {
                summary += number % 10;
            }

            number /= 10;
        }

        return summary;
    }
}

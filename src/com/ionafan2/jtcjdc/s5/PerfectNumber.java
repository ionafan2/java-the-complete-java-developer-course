package com.ionafan2.jtcjdc.s5;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int counter = number - 1;
        int summary = 0;

        while (counter > 0) {
            if (number % counter == 0) {
                summary += counter;
            }
            counter--;
        }

        return summary == number;
    }
}

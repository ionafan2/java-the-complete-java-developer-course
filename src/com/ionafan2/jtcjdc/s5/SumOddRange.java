package com.ionafan2.jtcjdc.s5;

public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {

        if ((start < 0 || end < 0) || end < start) {
            return -1;
        }

        int summary = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                summary += i;
            }
        }

        return summary;
    }
}

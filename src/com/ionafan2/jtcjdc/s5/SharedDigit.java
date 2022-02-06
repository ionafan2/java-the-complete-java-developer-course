package com.ionafan2.jtcjdc.s5;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {

        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }

        int oldB = b;

        while (a > 0) {
            int aLeastDigit = a % 10;
            while (b > 0) {
                int bLeastDigit = b % 10;
                if (aLeastDigit == bLeastDigit) {
                    return true;
                }
                b /= 10;
            }
            b = oldB;
            a /= 10;
        }

        return false;
    }
}

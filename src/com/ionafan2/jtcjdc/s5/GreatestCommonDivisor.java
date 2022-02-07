package com.ionafan2.jtcjdc.s5;

public class GreatestCommonDivisor {

   public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) {
            return -1;
        }

        int biggest = (a > b) ? a : b;
        int smallest = (a > b) ? b : a;
        int divisor = smallest;

        while (divisor > 0) {

            if (biggest % divisor == 0 && smallest % divisor == 0) {
                return divisor;
            }

            divisor--;
        }

        return 0;
    }
}
package com.ionafan2.jtcjdc.s4;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        return (long) (a * 1000) == (long) (b * 1000);
    }
}

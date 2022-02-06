package com.ionafan2.jtcjdc.s5;

public class InchToCmConverted {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet <= 0 || (inches < 0 || inches > 12)) {
            return -1;
        }

        return feet * 2.54 * 12 + inches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches <= 0) {
            return -1;
        }

        return calcFeetAndInchesToCentimeters(inches / 12, inches % 12);
    }
}

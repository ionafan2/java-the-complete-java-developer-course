package com.ionafan2.jtcjdc.s4;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (1 > year || 9999 < year) {
            return false;
        } else {
            if (year % 4 == 0) {

                if (year % 100 == 0 && year % 400 == 0) {
                    return true;
                } else  if (year % 100 == 0) {
                    return false;
                } else {
                    return true;
                }

            } else {
                return false;
            }
        }
    }
}

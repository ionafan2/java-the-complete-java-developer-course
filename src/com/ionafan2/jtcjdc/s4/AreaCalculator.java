package com.ionafan2.jtcjdc.s4;

public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double a, double b) {
        if (a < 0 || b < 0) {
            return -1;
        }

        return a * b;
    }

}

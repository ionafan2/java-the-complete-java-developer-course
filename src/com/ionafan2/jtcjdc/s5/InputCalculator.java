package com.ionafan2.jtcjdc.s5;

import java.io.InputStream;
import java.util.Scanner;

public class InputCalculator {

//    public static void inputThenPrintSumAndAverage() { // Exercise version
    public static void inputThenPrintSumAndAverage(InputStream inputStream) { // Testable version

//        Scanner scanner = new Scanner(System.in); // Exercise version
        Scanner scanner = new Scanner(inputStream); // Testable version

        int sum = 0;
        long avg = 0;
        int counter = 1;

        while (true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                avg = Math.round((double) sum / counter);
            } else {
                break;
            }
            scanner.nextLine();
            counter++;
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}

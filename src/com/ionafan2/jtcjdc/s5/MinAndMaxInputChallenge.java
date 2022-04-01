package com.ionafan2.jtcjdc.s5;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {

            System.out.println("Enter number:");

            if (scanner.hasNextInt()) {

                int currentNumber = scanner.nextInt();

                min = (currentNumber < min) ? currentNumber : min;
                max = (currentNumber > max) ? currentNumber : max;

            } else {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        scanner.close();
    }
}
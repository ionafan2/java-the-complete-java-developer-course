package com.ionafan2.jtcjdc.s5;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        long sum = 0;

        while (counter <= 10) {

            System.out.println("Enter Number #" + counter + ":");

            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid Number");
                counter--;
            }

            scanner.nextLine();
            counter++;
        }

        System.out.println("Sum of all numbers is: " + sum);
        scanner.close();
    }
}

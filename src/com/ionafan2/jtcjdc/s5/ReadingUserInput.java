package com.ionafan2.jtcjdc.s5;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        if (scanner.hasNextInt()) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle (enter key)

            int age = 2022 - yearOfBirth;

            System.out.println("Enter your Name: ");
            String name = scanner.nextLine();

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is: " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth!");
            }
        } else {
            System.out.println("Unable to parse Year of Birth!");
        }

        scanner.close();
    }
}

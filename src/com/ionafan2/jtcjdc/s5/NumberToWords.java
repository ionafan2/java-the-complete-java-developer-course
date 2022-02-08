package com.ionafan2.jtcjdc.s5;

public class NumberToWords {

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
        } else {

            int reverse = reverse(number);

            while (reverse > 0) {

                switch (reverse % 10) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Zero");
                        break;
                }
                reverse /= 10;
            }

            for (int i = 0; i < (getDigitCount(number) - getDigitCount(reverse(number))); i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {

        int reversed = 0;

        while (number != 0) {
            reversed += number % 10;
            number /= 10;
            reversed *= 10;
        }

        return reversed / 10;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number > 9) {
            int counter = 0;
            while (number > 0) {
                number /= 10;
                counter++;
            }
            return counter;
        }

        return 1;
    }
}

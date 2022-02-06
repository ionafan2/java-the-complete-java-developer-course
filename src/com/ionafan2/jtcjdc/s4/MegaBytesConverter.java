package com.ionafan2.jtcjdc.s4;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.printf(
                    "%s KB = %s MB and %s KB%n",
                    kiloBytes,
                    kiloBytes / 1024,
                    kiloBytes % 1024
            );
        }
    }
}
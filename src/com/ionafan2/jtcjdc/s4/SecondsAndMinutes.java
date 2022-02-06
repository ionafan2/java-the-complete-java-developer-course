package com.ionafan2.jtcjdc.s4;

public class SecondsAndMinutes {

    public static final String INVALID = "Invalid value";
    public static final String OUTPUT_FORMAT = "%02dh %02dm %02ds";


    public static String getDurationString(int minutes, int seconds) {
        if (minutes <= 0 || (seconds < 0 || seconds > 59)) {
            return INVALID;
        }

        return String.format(OUTPUT_FORMAT, minutes / 60, minutes % 60, seconds);
    }

    public static String getDurationString(int seconds) {
        if (seconds <= 0) {
            return INVALID;
        }

        return getDurationString(seconds / 60, seconds % 60);
    }
}
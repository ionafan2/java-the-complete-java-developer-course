package com.ionafan2.jtcjdc.s5;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (bigCount == 0 || goal < 5) {
            // if only small bags present or our goal is less than a big bag capacity
            // make sure our goal is less than or equal to small bags capacity
            return goal <= smallCount;
        }

        if (goal != (bigCount * 5)) {

            if (goal > (bigCount * 5)) {
                // if goal is more than big bags capacity
                // make sure that extra after big bags fit into small bags
                return (goal - (bigCount * 5)) <= smallCount;
            }

            if (goal < (bigCount * 5)) {
                // if goal less than big bags capacity
                // make sure that leftovers from big bag fit into small bags
                return (goal % 5) <= smallCount;
            }

        } else {
            // if our goal perfectly fits in all big bags - that means we can pack!
            // "it's okay if there are additional bags left over" - from exercise text
            return true;
        }

        return false;
    }
}

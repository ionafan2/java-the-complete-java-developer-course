package com.ionafan2.jtcjdc.s5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaintJobTest {

    /**
     * Examples of input/output:
     * <br>
     * <li>getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid.
     * <li>getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
     * <li>getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.
     */
    @Test
    void testGetBucketCountAllParams() {
        assertEquals(-1, PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        assertEquals(3, PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        assertEquals(3, PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
    }

    /**
     * Examples of input/output:
     * <br>
     * <li>getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid.
     * <li>getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
     * <li>getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.
     */
    @Test
    void testGetBucketCountNoExtraBucket() {
        assertEquals(-1, PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        assertEquals(5, PaintJob.getBucketCount(3.4, 2.1, 1.5));
        assertEquals(14, PaintJob.getBucketCount(7.25, 4.3, 2.35));
    }

    /**
     * Examples of input/output:
     * <br>
     * <li>getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5.
     * <li>getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.
     * <li>getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75.
     */
    @Test
    void testGetBucketCountWithAreaOnly() {
        assertEquals(-1, PaintJob.getBucketCount(-3.4, 1.5));
        assertEquals(3, PaintJob.getBucketCount(3.4, 1.5));
        assertEquals(3, PaintJob.getBucketCount(6.26, 2.2));
        assertEquals(5, PaintJob.getBucketCount(3.26, 0.75));
    }
}
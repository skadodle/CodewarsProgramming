package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RangeExtractionTest {

    @Test
    public void testNull() {
        assertNull(RangeExtraction.solution(null));
    }

    @Test
    public void testEmptyArray() {
        assertEquals("", RangeExtraction.solution(new int[]{}));
    }

    @Test
    public void testCase1() {
        assertEquals("-10--8,-6,-3-1,3-5,7-11,14,15,17-20", RangeExtraction.solution(new int[]{-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
    }
}
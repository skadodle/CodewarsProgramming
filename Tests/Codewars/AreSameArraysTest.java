package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AreSameArraysTest {
    @Test
    public void testCase1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertTrue(AreSameArrays.comp(a, b));
    }

    @Test
    public void testCase2() {
        int[] a = new int[]{11, 144, 19, 161, 121, 144, 19, 19};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertTrue(AreSameArrays.comp(a, b));
    }

    @Test
    public void testCase3() {
        int[] a = new int[]{2, 2, 3};
        int[] b = new int[]{4, 9, 9};
        assertFalse(AreSameArrays.comp(a, b));
    }

    @Test
    public void testCase4() {
        int[] a = new int[]{0, -14, 191, 161, 19, 144, 195, 1};
        int[] b = new int[]{1, 0, 196, 36481, 25921, 361, 20736, 38025};
        assertTrue(AreSameArrays.comp(a, b));
    }
}